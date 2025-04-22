package com.example.learnandplay.entity.game.sessions;

import com.example.learnandplay.entity.security.User;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
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
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "quiz_sessions")
public class QuizSession {

    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @Column(name = "correct_word", nullable = false)
    private String correctWord;

    @ElementCollection
    @Column(nullable = false)
    private List<String> options;

    @Column(nullable = false)
    private boolean completed = false;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "theme_name", nullable = false)
    private String themeName;

}
