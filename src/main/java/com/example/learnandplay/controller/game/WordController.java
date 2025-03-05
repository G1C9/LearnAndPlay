package com.example.learnandplay.controller.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/words")
public interface WordController {

    @GetMapping("/{themeId}")
    Map<String, String> getWordsByTheme(@PathVariable Long themeId);

}
