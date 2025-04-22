package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepository extends JpaRepository<Sentence, Long> {

    @Query(value = "SELECT sentences.text FROM sentences " +
            "JOIN themes ON themes.id = sentences.theme_id " +
            "WHERE themes.name = :themeName " +
            "ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    String findRandomSentence(@Param("themeName") String themeName);

}
