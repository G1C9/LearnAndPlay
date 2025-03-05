package com.example.learnandplay.service.game;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface WordService {

    Map<String, String> getWordsByTheme(Long themeId);

}
