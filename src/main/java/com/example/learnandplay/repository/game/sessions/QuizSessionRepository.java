package com.example.learnandplay.repository.game.sessions;

import com.example.learnandplay.entity.game.sessions.QuizSession;
import com.example.learnandplay.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface QuizSessionRepository extends JpaRepository<QuizSession, UUID> {

    boolean existsByUserAndThemeNameAndCompletedTrue(User user, String themeName);

}
