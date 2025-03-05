package com.example.learnandplay.controller.game;

import com.example.learnandplay.dto.game.ThemeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/themes")
public interface ThemeController {

    @GetMapping("/game/{gameId}")
    List<ThemeDto> getThemesByGame(@PathVariable Long gameId);

}
