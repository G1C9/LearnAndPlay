package com.example.learnandplay.dto.game.sessions;

import com.example.learnandplay.entity.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypingSessionDto {

    private UUID id;

    private User user;

    private Long wordId;

    private String imageUrl;

    private String correctAnswer;

    private boolean completed = false;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String themeName;

}
