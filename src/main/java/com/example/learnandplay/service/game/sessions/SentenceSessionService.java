package com.example.learnandplay.service.game.sessions;

import com.example.learnandplay.entity.game.sessions.SentenceSession;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public interface SentenceSessionService {

    SentenceSession startGame(Long userId, String themeName);

    boolean submitAnswers(UUID sessionId, List<String> userOrder);

}
