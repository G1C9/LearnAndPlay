package com.example.learnandplay.service.game.sessions.impl;

import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.entity.game.sessions.QuizSession;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.WordRepository;
import com.example.learnandplay.repository.game.sessions.QuizSessionRepository;
import com.example.learnandplay.service.game.ThemeService;
import com.example.learnandplay.service.game.achievements.AchievementService;
import com.example.learnandplay.service.game.sessions.QuizSessionService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Slf4j
public class QuizSessionServiceImpl implements QuizSessionService {

    private final WordRepository wordRepository;

    private final QuizSessionRepository quizSessionRepository;

    private final UserService userService;

    private final ThemeService themeService;

    private final AchievementService achievementService;

    @Override
    public QuizSession startGame(Long userId, String themeName) {
        User user = userService.findById(userId);

        themeService.checkUserHasAccessToTheme(user, themeName);

        List<Word> words = wordRepository.findRandomWords(themeName);
        Word correctWord = words.getFirst();

        List<String> options = Stream.concat(Stream.of(correctWord), words.stream())
                .map(Word::getWord)
                .distinct()
                .sorted(Comparator.comparing(w -> Math.random()))
                .toList();

        QuizSession session = QuizSession.builder()
                .id(UUID.randomUUID())
                .user(user)
                .correctWord(correctWord.getWord())
                .options(options)
                .completed(false)
                .startTime(LocalDateTime.now())
                .themeName(themeName)
                .build();

        log.info("Game started for user {} with theme {}", userId, themeName);
        return quizSessionRepository.save(session);
    }

    @Override
    public boolean submitAnswers(UUID sessionId, String selectedOption) {
        QuizSession session = quizSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));

        boolean allCorrect = selectedOption.equalsIgnoreCase(session.getCorrectWord());

        if (allCorrect) {
            completeSession(session);
            log.info("User {} completed the session {}", session.getUser().getId(), sessionId);
        } else {
            restartGame(session);
            log.error("User {} submitted incorrect answers for session {}", session.getUser().getId(), sessionId);
        }
        return allCorrect;

    }

    private void completeSession(QuizSession session) {
        session.setCompleted(true);
        session.setEndTime(LocalDateTime.now());
        quizSessionRepository.save(session);

        achievementService.checkAndUnlockAchievements(session.getUser());
    }

    private void restartGame(QuizSession session) {
        session.setCompleted(false);
        session.setStartTime(LocalDateTime.now());
        session.setEndTime(null);
        quizSessionRepository.save(session);
    }
}
