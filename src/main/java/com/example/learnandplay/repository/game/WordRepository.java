package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findByThemeId(Long themeId);

}
