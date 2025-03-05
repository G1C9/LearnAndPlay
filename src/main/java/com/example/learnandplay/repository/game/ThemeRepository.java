package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

    @Query("SELECT gt.theme FROM GameTheme gt WHERE gt.game.id = :gameId")
    List<Theme> findThemesByGameId(@Param("gameId") Long gameId);

}
