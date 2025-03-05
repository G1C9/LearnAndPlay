package com.example.learnandplay.service.game;

import com.example.learnandplay.dto.game.GameDto;
import com.example.learnandplay.entity.game.Game;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GameService {

    List<GameDto> getAll(Long id);

    Optional<Game> getById(Long id);

}
