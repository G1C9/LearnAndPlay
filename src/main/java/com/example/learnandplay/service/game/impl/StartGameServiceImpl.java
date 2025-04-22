package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import com.example.learnandplay.entity.game.sessions.QuizSession;
import com.example.learnandplay.entity.game.sessions.SentenceSession;
import com.example.learnandplay.entity.game.sessions.TypingSession;
import com.example.learnandplay.service.game.StartGameService;
import com.example.learnandplay.service.game.sessions.DrugAndDropSessionService;
import com.example.learnandplay.service.game.sessions.QuizSessionService;
import com.example.learnandplay.service.game.sessions.SentenceSessionService;
import com.example.learnandplay.service.game.sessions.TypingSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StartGameServiceImpl implements StartGameService {

    private final DrugAndDropSessionService drugAndDropSessionService;

    private final QuizSessionService quizSessionService;

    private final SentenceSessionService sentenceSessionService;

    private final TypingSessionService typingSessionService;

    @Override
    public DrugAndDropSession startFirstGame(Long userId, String themeName) {
        return drugAndDropSessionService.startGame(userId, themeName);
    }

    @Override
    public QuizSession startSecondGame(Long userId, String themeName) {
        return quizSessionService.startGame(userId, themeName);
    }

    @Override
    public SentenceSession startThirdGame(Long userId, String themeName) {
        return sentenceSessionService.startGame(userId, themeName);
    }


    @Override
    public TypingSession startFourthGame(Long userId, String themeName) {
        return typingSessionService.startGame(userId, themeName);
    }

}
