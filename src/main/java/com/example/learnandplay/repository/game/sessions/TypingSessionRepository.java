package com.example.learnandplay.repository.game.sessions;

import com.example.learnandplay.entity.game.sessions.TypingSession;
import com.example.learnandplay.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface TypingSessionRepository extends JpaRepository<TypingSession, UUID> {

    boolean existsByUserAndThemeNameAndCompletedTrue(User user, String themeName);

}
