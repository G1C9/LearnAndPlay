package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Word;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface WordRepository extends JpaRepository<Word, Long> {

    @EntityGraph(attributePaths = {"theme"})
    List<Word> findByThemeId(Long themeId);

    @Query(value = "SELECT words.id, words.word, words.translation, words.image_url, words.theme_id FROM words " +
            "JOIN themes ON themes.id = words.theme_id " +
            "WHERE themes.name = :themeName " +
            "ORDER BY RANDOM() LIMIT 4", nativeQuery = true)
    List<Word> findRandomWords(@Param("themeName") String themeName);

    @Query(value = "SELECT words.id, words.word, words.translation, words.image_url, words.theme_id FROM words " +
            "JOIN themes ON themes.id = words.theme_id " +
            "WHERE themes.name = :themeName " +
            "ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Word findRandomWord(@Param("themeName") String themeName);

    @Query("SELECT w FROM Word w WHERE w.word = :word")
    Optional<Word> findByWord(@Param("word") String word);

    @Query("SELECT w FROM Word w WHERE w.translation = :translation")
    Optional<Word> findByTranslation(@Param("translation") String translation);

}
