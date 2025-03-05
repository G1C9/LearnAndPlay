package com.example.learnandplay.service.game;

import com.example.learnandplay.entity.game.Theme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThemeService {

    List<Theme> getThemesByGame(Long gameId);

}
