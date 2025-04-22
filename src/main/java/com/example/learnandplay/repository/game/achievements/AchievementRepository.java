package com.example.learnandplay.repository.game.achievements;

import com.example.learnandplay.entity.game.achievements.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {

    Optional<Achievement> findByCode(String code);

}
