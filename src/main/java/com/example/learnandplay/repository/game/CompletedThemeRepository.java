package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.CompletedTheme;
import com.example.learnandplay.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompletedThemeRepository extends JpaRepository<CompletedTheme, Long> {

    boolean existsByUserAndThemeName(User user, String themeName);

}
