package com.example.learnandplay.controller.game;

import com.example.learnandplay.dto.game.sessions.DrugAndDropSessionDto;
import com.example.learnandplay.dto.game.sessions.QuizSessionDto;
import com.example.learnandplay.dto.game.sessions.SentenceSessionDto;
import com.example.learnandplay.dto.game.sessions.TypingSessionDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
@Tag(name = "Контроллер для начала игр")
public interface StartGameController {

    @PostMapping("/firstGame/start")
    @ResponseStatus(HttpStatus.CREATED)
    DrugAndDropSessionDto startFirstGame(@RequestParam Long userId, @RequestParam String themeName);

    @PostMapping("/secondGame/start")
    @ResponseStatus(HttpStatus.CREATED)
    QuizSessionDto startSecondGame(@RequestParam Long userId, @RequestParam String themeName);

    @PostMapping("/thirdGame/start")
    @ResponseStatus(HttpStatus.CREATED)
    SentenceSessionDto startThirdGame(@RequestParam Long userId, @RequestParam String themeName);

    @PostMapping("/fourthGame/start")
    @ResponseStatus(HttpStatus.CREATED)
    TypingSessionDto startFourthGame(@RequestParam Long userId, @RequestParam String themeName);

}