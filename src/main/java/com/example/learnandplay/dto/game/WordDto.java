package com.example.learnandplay.dto.game;

import com.example.learnandplay.entity.game.Theme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WordDto {

    private Long id;

    private String word;

    private String translation;

    private String imageUrl;

    private Theme theme;

}
