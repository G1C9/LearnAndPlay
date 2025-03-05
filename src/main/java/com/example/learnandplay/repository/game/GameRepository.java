package com.example.learnandplay.repository.game;

import com.example.learnandplay.entity.game.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
