package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.StartGameController;
import com.example.learnandplay.dto.game.sessions.DrugAndDropSessionDto;
import com.example.learnandplay.dto.game.sessions.QuizSessionDto;
import com.example.learnandplay.dto.game.sessions.SentenceSessionDto;
import com.example.learnandplay.dto.game.sessions.TypingSessionDto;
import com.example.learnandplay.mapper.sessions.DrugAndDropSessionMapper;
import com.example.learnandplay.mapper.sessions.QuizSessionMapper;
import com.example.learnandplay.mapper.sessions.SentenceSessionMapper;
import com.example.learnandplay.mapper.sessions.TypingSessionMapper;
import com.example.learnandplay.service.game.StartGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StartGameControllerImpl implements StartGameController {

    private final StartGameService startGameService;

    private final DrugAndDropSessionMapper drugAndDropSessionMapper;

    private final QuizSessionMapper quizSessionMapper;

    private final SentenceSessionMapper sentenceSessionMapper;

    private final TypingSessionMapper typingSessionMapper;

    @Override
    public DrugAndDropSessionDto startFirstGame(Long userId, String themeName) {
        return drugAndDropSessionMapper.map(startGameService.startFirstGame(userId, themeName));
    }

    @Override
    public QuizSessionDto startSecondGame(Long userId, String themeName) {
        return quizSessionMapper.map(startGameService.startSecondGame(userId, themeName));
    }

    @Override
    public SentenceSessionDto startThirdGame(Long userId, String themeName) {
        return sentenceSessionMapper.map(startGameService.startThirdGame(userId, themeName));
    }

    @Override
    public TypingSessionDto startFourthGame(Long userId, String themeName) {
        return typingSessionMapper.map(startGameService.startFourthGame(userId, themeName));
    }

}
