package com.example.learnandplay.repository.game.sessions;

import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import com.example.learnandplay.entity.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface DrugAndDropSessionRepository extends JpaRepository<DrugAndDropSession, UUID> {

    boolean existsByUserAndThemeNameAndCompletedTrue(User user, String themeName);

    boolean existsByUserAndCompletedTrue(User user);

}
