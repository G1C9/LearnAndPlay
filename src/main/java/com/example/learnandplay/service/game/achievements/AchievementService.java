package com.example.learnandplay.service.game.achievements;

import com.example.learnandplay.entity.security.User;
import org.springframework.stereotype.Service;

@Service
public interface AchievementService {

    void checkAndUnlockAchievements(User user);

}
