package com.example.learnandplay.service.game.sessions.impl;

import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.entity.game.sessions.TypingSession;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.WordRepository;
import com.example.learnandplay.repository.game.sessions.TypingSessionRepository;
import com.example.learnandplay.service.game.ProgressService;
import com.example.learnandplay.service.game.ThemeService;
import com.example.learnandplay.service.game.achievements.AchievementService;
import com.example.learnandplay.service.game.sessions.TypingSessionService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class TypingSessionServiceImpl implements TypingSessionService {

    private final WordRepository wordRepository;

    private final TypingSessionRepository typingSessionRepository;

    private final UserService userService;

    private final ProgressService progressService;

    private final ThemeService themeService;

    private final AchievementService achievementService;

    @Override
    public TypingSession startGame(Long userId, String themeName) {
        User user = userService.findById(userId);

        themeService.checkUserHasAccessToTheme(user, themeName);

        Word word = wordRepository.findRandomWord(themeName);

        TypingSession session = TypingSession.builder()
                .id(UUID.randomUUID())
                .user(user)
                .wordId(word.getId())
                .imageUrl(word.getImageUrl())
                .correctAnswer(word.getWord())
                .completed(false)
                .startTime(LocalDateTime.now())
                .themeName(themeName)
                .build();

        log.info("Game started for user {} with theme {}", userId, themeName);
        return typingSessionRepository.save(session);
    }

    @Override
    public boolean submitAnswers(UUID sessionId, String userInput) {
        TypingSession session = typingSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));

        boolean allCorrect = session.getCorrectAnswer().equalsIgnoreCase(userInput);

        if (allCorrect) {
            completeSession(session);
            progressService.checkAndIncreaseLevel(session.getUser(), session.getThemeName());
            log.info("User {} completed the session {}", session.getUser().getId(), sessionId);
        } else {
            restartGame(session);
            log.error("User {} submitted incorrect answers for session {}", session.getUser().getId(), sessionId);
        }

        return allCorrect;
    }

    private void completeSession(TypingSession session) {
        session.setCompleted(true);
        session.setEndTime(LocalDateTime.now());
        typingSessionRepository.save(session);

        achievementService.checkAndUnlockAchievements(session.getUser());
    }

    private void restartGame(TypingSession session) {
        session.setCompleted(false);
        session.setStartTime(LocalDateTime.now());
        session.setEndTime(null);
        typingSessionRepository.save(session);
    }

}
