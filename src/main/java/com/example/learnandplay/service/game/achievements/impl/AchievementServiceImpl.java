package com.example.learnandplay.service.game.achievements.impl;

import com.example.learnandplay.entity.game.Theme;
import com.example.learnandplay.entity.game.achievements.Achievement;
import com.example.learnandplay.entity.game.achievements.UserAchievement;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.ThemeRepository;
import com.example.learnandplay.repository.game.achievements.AchievementRepository;
import com.example.learnandplay.repository.game.achievements.UserAchievementRepository;
import com.example.learnandplay.repository.game.sessions.DrugAndDropSessionRepository;
import com.example.learnandplay.repository.game.sessions.QuizSessionRepository;
import com.example.learnandplay.repository.game.sessions.SentenceSessionRepository;
import com.example.learnandplay.repository.game.sessions.TypingSessionRepository;
import com.example.learnandplay.service.game.achievements.AchievementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import static com.example.learnandplay.constant.AchievementUtils.BEGINNER;
import static com.example.learnandplay.constant.AchievementUtils.POLYGLOT_NUMBERS;
import static com.example.learnandplay.constant.AchievementUtils.POLYGLOT_ANIMALS;
import static com.example.learnandplay.constant.AchievementUtils.POLYGLOT_FOOD;
import static com.example.learnandplay.constant.AchievementUtils.POLYGLOT_EXPLORER;
import static com.example.learnandplay.constant.AchievementUtils.EXPERT;
import static com.example.learnandplay.constant.ThemeNameUtils.NUMBERS_AND_DAYS_OF_THE_WEEK;
import static com.example.learnandplay.constant.ThemeNameUtils.ANIMALS;
import static com.example.learnandplay.constant.ThemeNameUtils.FOOD;
import static com.example.learnandplay.constant.ThemeNameUtils.EXPLORE_THE_WORLD;

@Service
@RequiredArgsConstructor
@Slf4j
public class AchievementServiceImpl implements AchievementService {

    private final AchievementRepository achievementRepository;

    private final UserAchievementRepository userAchievementRepository;

    private final DrugAndDropSessionRepository drugAndDropSessionRepository;

    private final QuizSessionRepository quizSessionRepository;

    private final SentenceSessionRepository sentenceSessionRepository;

    private final TypingSessionRepository typingSessionRepository;

    private final ThemeRepository themeRepository;

    @Override
    public void checkAndUnlockAchievements(User user) {
        unlockBeginner(user);
        unlockPolyglot(user);
        unlockExpert(user);
    }

    private void unlockBeginner(User user) {
        if (hasAchievement(user, BEGINNER)) return;

        boolean hasAnyGame = drugAndDropSessionRepository.existsByUserAndCompletedTrue(user);
        if (hasAnyGame) {
            grantAchievement(user, BEGINNER);
        }
    }

    private void unlockPolyglot(User user) {
        Map<String, String> themeCodeMap = Map.of(
                NUMBERS_AND_DAYS_OF_THE_WEEK, POLYGLOT_NUMBERS,
                ANIMALS, POLYGLOT_ANIMALS,
                FOOD, POLYGLOT_FOOD,
                EXPLORE_THE_WORLD, POLYGLOT_EXPLORER
        );

        for (Map.Entry<String, String> entry : themeCodeMap.entrySet()) {
            String themeName = entry.getKey();
            String achievementCode = entry.getValue();

            if (hasAchievement(user, achievementCode)) continue;

            boolean completed = drugAndDropSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName)
                    && quizSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName)
                    && sentenceSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName)
                    && typingSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName);

            if (completed) {
                grantAchievement(user, achievementCode);
            }
        }
    }

    private void unlockExpert(User user) {
        if (hasAchievement(user, EXPERT)) return;

        List<String> themes = themeRepository.findAll()
                .stream().map(Theme::getName).toList();

        boolean allThemesCompleted = true;

        for (String theme : themes) {
            boolean themeCompleted = drugAndDropSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, theme)
                    && quizSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, theme)
                    && sentenceSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, theme)
                    && typingSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user ,theme);

            if (!themeCompleted) {
                allThemesCompleted = false;
                break;
            }
        }

        if (allThemesCompleted) {
            grantAchievement(user, EXPERT);
        }
    }

    private boolean hasAchievement(User user, String code) {
        return userAchievementRepository.existsByUserAndAchievementCode(user, code);
    }

    private void grantAchievement(User user, String code) {
        Achievement achievement = achievementRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Achievement not found: " + code));

        userAchievementRepository.save(UserAchievement.builder()
                .user(user)
                .achievement(achievement)
                .unlockedAt(LocalDateTime.now())
                .build());

        log.info("User received a new achievement: {}", code);
    }

}
