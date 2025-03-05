package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.entity.game.Theme;
import com.example.learnandplay.repository.game.ThemeRepository;
import com.example.learnandplay.service.game.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeServiceImpl implements ThemeService {

    private final ThemeRepository themeRepository;

    @Override
    public List<Theme> getThemesByGame(Long gameId) {
        return themeRepository.findThemesByGameId(gameId);
    }

}
