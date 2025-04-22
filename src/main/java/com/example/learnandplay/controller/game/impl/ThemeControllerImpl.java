package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.ThemeController;
import com.example.learnandplay.dto.game.ThemeDto;
import com.example.learnandplay.service.game.ThemeService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ThemeControllerImpl implements ThemeController {

    private final ThemeService themeService;

    private final UserService userService;

    @Override
    public List<ThemeDto> getAvailableThemes(Long userId) {
        return themeService.getThemesByUserLevel(userService.findById(userId).getLevel());
    }

}
