package com.example.learnandplay.service.game;

import com.example.learnandplay.dto.game.ThemeDto;
import com.example.learnandplay.entity.security.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ThemeService {

    List<ThemeDto> getThemesByUserLevel(int userLevel);

    void checkUserHasAccessToTheme(User user, String themeName);

}
