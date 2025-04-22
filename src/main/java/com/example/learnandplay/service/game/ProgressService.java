package com.example.learnandplay.service.game;

import com.example.learnandplay.entity.security.User;
import org.springframework.stereotype.Service;

@Service
public interface ProgressService {

    void checkAndIncreaseLevel(User user, String themeName);

}
