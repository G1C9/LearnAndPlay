package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.ThemeController;
import com.example.learnandplay.dto.game.ThemeDto;
import com.example.learnandplay.mapper.ThemeMapper;
import com.example.learnandplay.service.game.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ThemeControllerImpl implements ThemeController {

    private final ThemeService themeService;

    private final ThemeMapper themeMapper;

    @Override
    public List<ThemeDto> getThemesByGame(Long gameId) {
        return themeMapper.map(themeService.getThemesByGame(gameId));
    }
}
