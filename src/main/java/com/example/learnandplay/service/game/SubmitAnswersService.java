package com.example.learnandplay.service.game;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public interface SubmitAnswersService {

    boolean submitFirstGameAnswers(UUID sessionId, Map<String, String> pairs);

    boolean submitSecondGameAnswers(UUID sessionId, String selectedOption);

    boolean submitThirdGameAnswers(UUID sessionId, List<String> userOrder);

    boolean submitFourthGameAnswers(UUID sessionId, String userInput);

}
