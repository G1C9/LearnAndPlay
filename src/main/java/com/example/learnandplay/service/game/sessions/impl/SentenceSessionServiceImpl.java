package com.example.learnandplay.service.game.sessions.impl;

import com.example.learnandplay.entity.game.sessions.SentenceSession;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.SentenceRepository;
import com.example.learnandplay.repository.game.sessions.SentenceSessionRepository;
import com.example.learnandplay.service.game.ThemeService;
import com.example.learnandplay.service.game.achievements.AchievementService;
import com.example.learnandplay.service.game.sessions.SentenceSessionService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class SentenceSessionServiceImpl implements SentenceSessionService {

    private final SentenceRepository sentenceRepository;

    private final SentenceSessionRepository sessionRepository;

    private final UserService userService;

    private final ThemeService themeService;

    private final AchievementService achievementService;

    @Override
    public SentenceSession startGame(Long userId, String themeName) {
        User user = userService.findById(userId);

        themeService.checkUserHasAccessToTheme(user, themeName);

        String sentence = sentenceRepository.findRandomSentence(themeName);

        List<String> shuffledWords = new ArrayList<>(List.of(sentence.split(" ")));
        Collections.shuffle(shuffledWords);

        SentenceSession session = SentenceSession.builder()
                .id(UUID.randomUUID())
                .user(user)
                .originalSentence(sentence)
                .shuffledWords(shuffledWords)
                .completed(false)
                .startTime(LocalDateTime.now())
                .themeName(themeName)
                .build();

        log.info("Game started for user {} with theme {}", userId, themeName);
        return sessionRepository.save(session);
    }

    @Override
    public boolean submitAnswers(UUID sessionId, List<String> userOrder) {
        SentenceSession session = sessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));

        boolean correct = String.join(" ", userOrder).equalsIgnoreCase(session.getOriginalSentence());

        if (correct) {
            completeSession(session);
            log.info("User {} completed the session {}", session.getUser().getId(), sessionId);
        } else {
            log.error("User {} submitted incorrect answers for session {}", session.getUser().getId(), sessionId);
            restartGame(session);
        }

        return correct;
    }

    private void completeSession(SentenceSession session) {
        session.setCompleted(true);
        session.setEndTime(LocalDateTime.now());
        sessionRepository.save(session);

        achievementService.checkAndUnlockAchievements(session.getUser());
    }

    private void restartGame(SentenceSession session) {
        session.setCompleted(false);
        session.setStartTime(LocalDateTime.now());
        session.setEndTime(null);
        sessionRepository.save(session);
    }

}
