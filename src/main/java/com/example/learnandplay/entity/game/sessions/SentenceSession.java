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
@Table(name = "sentence_sessions")
public class SentenceSession {

    @Id
    private UUID id;

    @ManyToOne
    private User user;

    @Column(name = "original_sentence", nullable = false)
    private String originalSentence;

    @ElementCollection
    @Column(name = "shuffled_words", nullable = false)
    private List<String> shuffledWords;

    @Column(nullable = false)
    private boolean completed = false;

    @Column(name = "start_time",nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "theme_name", nullable = false)
    private String themeName;

}
