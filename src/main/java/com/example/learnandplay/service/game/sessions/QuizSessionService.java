package com.example.learnandplay.service.game.sessions;

import com.example.learnandplay.entity.game.sessions.QuizSession;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public interface QuizSessionService {

    QuizSession startGame(Long userId, String themeName);

    boolean submitAnswers(UUID sessionId, String selectedOption);

}
