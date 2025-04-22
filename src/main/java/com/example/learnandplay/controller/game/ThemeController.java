package com.example.learnandplay.controller.game;

import com.example.learnandplay.dto.game.ThemeDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/themes")
@Tag(name = "Контроллер для тем", description = "Контроллер для получения тем для пользователя")
public interface ThemeController {

    @GetMapping("/{userId}")
    List<ThemeDto> getAvailableThemes(@PathVariable Long userId);

}
