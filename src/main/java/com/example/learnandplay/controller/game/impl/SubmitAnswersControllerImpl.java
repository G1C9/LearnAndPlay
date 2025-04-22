package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.SubmitAnswersController;
import com.example.learnandplay.service.game.SubmitAnswersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class SubmitAnswersControllerImpl implements SubmitAnswersController {

    private final SubmitAnswersService submitAnswersService;

    @Override
    public Boolean submitFirstAnswers(UUID sessionId, Map<String, String> pairs) {
        return submitAnswersService.submitFirstGameAnswers(sessionId, pairs);
    }

    @Override
    public Boolean submitSecondAnswers(UUID sessionId, String selectedOption) {
        return submitAnswersService.submitSecondGameAnswers(sessionId, selectedOption);
    }

    @Override
    public Boolean submitThirdAnswers(UUID sessionId, List<String> userOrder) {
        return submitAnswersService.submitThirdGameAnswers(sessionId, userOrder);
    }

    @Override
    public Boolean submitFourthAnswers(UUID sessionId, String userInput) {
        return submitAnswersService.submitFourthGameAnswers(sessionId, userInput);
    }

}
