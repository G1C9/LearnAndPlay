package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.entity.game.CompletedTheme;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.CompletedThemeRepository;
import com.example.learnandplay.repository.game.sessions.DrugAndDropSessionRepository;
import com.example.learnandplay.repository.game.sessions.QuizSessionRepository;
import com.example.learnandplay.repository.game.sessions.SentenceSessionRepository;
import com.example.learnandplay.repository.game.sessions.TypingSessionRepository;
import com.example.learnandplay.repository.security.UserRepository;
import com.example.learnandplay.service.game.ProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ProgressServiceImpl implements ProgressService {

    private final DrugAndDropSessionRepository drugAndDropSessionRepository;

    private final QuizSessionRepository quizSessionRepository;

    private final SentenceSessionRepository sentenceSessionRepository;

    private final TypingSessionRepository typingSessionRepository;

    private final CompletedThemeRepository completedThemeRepository;

    private final UserRepository userRepository;

    @Override
    public void checkAndIncreaseLevel(User user, String themeName) {
        if (completedThemeRepository.existsByUserAndThemeName(user, themeName)) {
            return;
        }

        boolean allGamesCompleted =
                drugAndDropSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName) &&
                quizSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName) &&
                sentenceSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName) &&
                typingSessionRepository.existsByUserAndThemeNameAndCompletedTrue(user, themeName);

        if (allGamesCompleted) {
            user.setLevel(user.getLevel() + 1);
            userRepository.save(user);

             CompletedTheme completedTheme = CompletedTheme.builder()
                    .user(user)
                    .themeName(themeName)
                    .completedAt(LocalDateTime.now())
                    .build();

            completedThemeRepository.save(completedTheme);
        }
    }

}
