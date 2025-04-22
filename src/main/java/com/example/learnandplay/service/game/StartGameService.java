package com.example.learnandplay.service.game;

import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import com.example.learnandplay.entity.game.sessions.QuizSession;
import com.example.learnandplay.entity.game.sessions.SentenceSession;
import com.example.learnandplay.entity.game.sessions.TypingSession;
import org.springframework.stereotype.Service;

@Service
public interface StartGameService {

    DrugAndDropSession startFirstGame(Long userId, String themeName);

    QuizSession startSecondGame(Long userId, String themeName);

    SentenceSession startThirdGame(Long userId, String themeName);

    TypingSession startFourthGame(Long userId, String themeName);

}
