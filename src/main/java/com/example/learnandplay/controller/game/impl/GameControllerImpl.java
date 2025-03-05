package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.GameController;
import com.example.learnandplay.dto.game.GameDto;
import com.example.learnandplay.service.game.GameService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameControllerImpl implements GameController {

    private final GameService gameService;

    private final UserService userService;

    @Override
    public List<GameDto> getAll(Long userId) {
        return gameService.getAll(userId);
    }

}
