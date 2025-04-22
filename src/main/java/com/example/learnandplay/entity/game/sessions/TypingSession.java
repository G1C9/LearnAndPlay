package com.example.learnandplay.entity.game.sessions;

import com.example.learnandplay.entity.security.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "typing_sessions")
public class TypingSession {

    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @Column(name = "word_id", nullable = false)
    private Long wordId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "correct_answer", nullable = false)
    private String correctAnswer;

    @Column(nullable = false)
    private boolean completed = false;

    @Column(name = "start_time",nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "theme_name", nullable = false)
    private String themeName;

}