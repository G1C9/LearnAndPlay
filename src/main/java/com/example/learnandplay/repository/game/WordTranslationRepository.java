package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Word;
import com.example.learnandplay.entity.game.WordTranslation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface WordTranslationRepository extends JpaRepository<WordTranslation, Long> {

    @Query("SELECT wt.translation FROM WordTranslation wt WHERE wt.word.id = :wordId")
    List<Word> findTranslationByWordId(@Param("wordId") Long wordId);

}
