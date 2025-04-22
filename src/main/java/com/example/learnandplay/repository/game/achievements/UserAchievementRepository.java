package com.example.learnandplay.repository.game.achievements;

import com.example.learnandplay.entity.game.achievements.UserAchievement;
import com.example.learnandplay.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAchievementRepository extends JpaRepository<UserAchievement, Long> {

    boolean existsByUserAndAchievementCode(User user, String code);

}
