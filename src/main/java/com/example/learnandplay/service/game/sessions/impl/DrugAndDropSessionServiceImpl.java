package com.example.learnandplay.service.game.sessions.impl;

import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.sessions.DrugAndDropSessionRepository;
import com.example.learnandplay.repository.game.WordRepository;
import com.example.learnandplay.service.game.ThemeService;
import com.example.learnandplay.service.game.achievements.AchievementService;
import com.example.learnandplay.service.game.sessions.DrugAndDropSessionService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class DrugAndDropSessionServiceImpl implements DrugAndDropSessionService {

    private final WordRepository wordRepository;

    private final DrugAndDropSessionRepository drugAndDropSessionRepository;

    private final UserService userService;

    private final ThemeService themeService;

    private final AchievementService achievementService;

    @Override
    public DrugAndDropSession startGame(Long userId, String themeName) {
        User user = userService.findById(userId);

        themeService.checkUserHasAccessToTheme(user, themeName);

        List<Word> sourceWords = wordRepository.findRandomWords(themeName);

        DrugAndDropSession session = DrugAndDropSession.builder()
                .id(UUID.randomUUID())
                .user(user)
                .completed(false)
                .startTime(LocalDateTime.now())
                .themeName(themeName)
                .selectedWords(sourceWords)
                .build();

        log.info("Game started for user {} with theme {}", userId, themeName);
        return drugAndDropSessionRepository.save(session);
    }

    @Override
    public boolean submitAnswers(UUID sessionId, Map<String, String> pairs) {
        if (sessionId == null || pairs == null || pairs.isEmpty()) {
            throw new IllegalArgumentException("Incorrect request parameters");
        }

        DrugAndDropSession session = drugAndDropSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found"));

        boolean allCorrect = pairs.entrySet().stream().allMatch(entry -> {
            Word sourceWord = wordRepository.findByWord(entry.getKey())
                    .orElseThrow(() -> new RuntimeException("Word not found"));

            Word selectedTranslation = wordRepository.findByTranslation(entry.getValue())
                    .orElseThrow(() -> new RuntimeException("Selected translation not found"));

            return isTranslationCorrect(sourceWord, selectedTranslation);
        });

        if (allCorrect) {
            completeSession(session);
            log.info("User {} completed the session {}", session.getUser().getId(), sessionId);
        } else {
            restartGame(session);
            log.error("User {} submitted incorrect answers for session {}", session.getUser().getId(), sessionId);
        }

        return allCorrect;
    }

    private boolean isTranslationCorrect(Word sourceWord, Word selectedTranslation) {
        return sourceWord.getTranslation().equalsIgnoreCase(selectedTranslation.getTranslation());
    }

    private void completeSession(DrugAndDropSession session) {
        session.setCompleted(true);
        session.setEndTime(LocalDateTime.now());
        drugAndDropSessionRepository.save(session);

        achievementService.checkAndUnlockAchievements(session.getUser());
    }

    private void restartGame(DrugAndDropSession session) {
        session.setCompleted(false);
        session.setStartTime(LocalDateTime.now());
        session.setEndTime(null);
        drugAndDropSessionRepository.save(session);
    }

}