package com.example.learnandplay.controller.game.impl;

import com.example.learnandplay.controller.game.WordController;
import com.example.learnandplay.service.game.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class WordControllerImpl implements WordController {

    private final WordService wordService;

    @Override
    public Map<String, String> getWordsByTheme(Long themeId) {
        return wordService.getWordsByTheme(themeId);
    }

}
