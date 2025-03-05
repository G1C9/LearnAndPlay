package com.example.learnandplay.service.game.impl;

import com.example.learnandplay.dto.game.GameDto;
import com.example.learnandplay.entity.game.Game;
import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.game.GameRepository;
import com.example.learnandplay.repository.security.UserRepository;
import com.example.learnandplay.service.game.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    private final UserRepository userRepository;

    @Override
    public List<GameDto> getAll(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + userId));

        return gameRepository.findAll().stream()
                .map(game -> new GameDto(
                        game.getId(),
                        game.getName(),
                        game.getDescription(),
                        game.getRequiredLevel(),
                        game.getRequiredLevel() <= user.getLevel()
                )).toList();
    }

    @Override
    public Optional<Game> getById(Long id) {
        Optional<Game> game = gameRepository.findById(id);
        return Optional.empty();
    }
}
