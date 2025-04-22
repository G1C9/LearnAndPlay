package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.service.game.SubmitAnswersService;
import com.example.learnandplay.service.game.sessions.DrugAndDropSessionService;
import com.example.learnandplay.service.game.sessions.QuizSessionService;
import com.example.learnandplay.service.game.sessions.SentenceSessionService;
import com.example.learnandplay.service.game.sessions.TypingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SubmitAnswersServiceImpl implements SubmitAnswersService {

    private final DrugAndDropSessionService drugAndDropSessionService;

    private final QuizSessionService quizSessionService;

    private final SentenceSessionService sentenceSessionService;

    private final TypingSessionService typingSessionService;

    @Override
    public boolean submitFirstGameAnswers(UUID sessionId, Map<String, String> pairs) {
        return drugAndDropSessionService.submitAnswers(sessionId, pairs);
    }

    @Override
    public boolean submitSecondGameAnswers(UUID sessionId, String selectedOption) {
        return quizSessionService.submitAnswers(sessionId, selectedOption);
    }

    @Override
    public boolean submitThirdGameAnswers(UUID sessionId, List<String> userOrder) {
        return sentenceSessionService.submitAnswers(sessionId, userOrder);
    }

    @Override
    public boolean submitFourthGameAnswers(UUID sessionId, String userInput) {
        return typingSessionService.submitAnswers(sessionId, userInput);
    }

}
