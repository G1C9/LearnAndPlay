package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.dto.game.ThemeDto;
import com.example.learnandplay.entity.game.Theme;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.ThemeRepository;
import com.example.learnandplay.service.game.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService {

    private final ThemeRepository themeRepository;

    @Override
    public List<ThemeDto> getThemesByUserLevel(int userLevel) {
        List<Theme> themes = themeRepository.findAll();
        return themes.stream()
                .map(theme ->
                    new ThemeDto(
                            theme.getId(),
                            theme.getName(),
                            theme.getRequiredLevel() <= userLevel
                    )
                )
                .collect(Collectors.toList());
    }

    @Override
    public void checkUserHasAccessToTheme(User user, String themeName) {
        Theme theme = themeRepository.findByName(themeName)
                .orElseThrow(() -> new RuntimeException("Theme not found: " + themeName));

        if (user.getLevel() < theme.getRequiredLevel()) {
            throw new RuntimeException("This theme is available from level: " + theme.getRequiredLevel());
        }
    }

}
