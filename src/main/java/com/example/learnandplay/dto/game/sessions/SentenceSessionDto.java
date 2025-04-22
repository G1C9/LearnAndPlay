package com.example.learnandplay.dto.game.sessions;

import com.example.learnandplay.entity.security.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SentenceSessionDto {

    private UUID id;

    private User user;

    private String originalSentence;

    private List<String> shuffledWords;

    private boolean completed = false;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String themeName;

}
