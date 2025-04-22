package com.example.learnandplay.entity.game.sessions;

import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.entity.security.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "drug_and_drop_sessions")
public class DrugAndDropSession {

    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private boolean completed = false;

    @Column(name = "start_time",nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "theme_name",nullable = false)
    private String themeName;

    @ManyToMany
    @JoinTable(
            name = "drug_and_drop_session_words",
            joinColumns = @JoinColumn(name = "drug_and_drop_session_id"),
            inverseJoinColumns = @JoinColumn(name = "word_id")
    )
    private List<Word> selectedWords;

}
