package com.example.learnandplay.controller.game;

import com.example.learnandplay.dto.game.GameDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public interface GameController {

    @GetMapping("/user/{userId}")
    List<GameDto> getAll(@PathVariable Long userId);

}
