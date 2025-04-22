package com.example.learnandplay.service.game.sessions;

import com.example.learnandplay.entity.game.sessions.TypingSession;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public interface TypingSessionService {

    TypingSession startGame(Long userId, String themeName);

    boolean submitAnswers(UUID sessionId, String userInput);

}
