package com.example.learnandplay.dto.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameDto {

    private Long id;

    private String name;

    private String description;

    private int requiredLevel;

    boolean isAccessible;

}
