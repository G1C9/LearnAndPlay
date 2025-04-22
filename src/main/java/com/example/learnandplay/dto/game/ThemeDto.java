package com.example.learnandplay.dto.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThemeDto {

    private Long id;

    private String name;

    private boolean isAvailable;

}
