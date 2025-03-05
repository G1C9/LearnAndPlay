package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.repository.game.WordRepository;
import com.example.learnandplay.service.game.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    @Override
    public Map<String, String> getWordsByTheme(Long themeId) {
        List<Word> words = wordRepository.findByThemeId(themeId);

        Map<String, String> wordMap = new HashMap<>();
        for (Word word : words) {
            wordMap.put(word.getWord(), word.getTranslation());
        }
        return wordMap;
    }

}
