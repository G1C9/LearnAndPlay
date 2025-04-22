package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

    Optional<Theme> findByName(String name);

}
