package com.example.learnandplay.service.game.sessions;

import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.UUID;

@Service
public interface DrugAndDropSessionService {

    DrugAndDropSession startGame(Long userId, String themeName);

    boolean submitAnswers(UUID sessionId, Map<String, String> pairs);

}
