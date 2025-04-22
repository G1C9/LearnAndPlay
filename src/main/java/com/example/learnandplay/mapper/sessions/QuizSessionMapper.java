package com.example.learnandplay.mapper.sessions;

import com.example.learnandplay.dto.game.sessions.QuizSessionDto;
import com.example.learnandplay.entity.game.sessions.QuizSession;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface QuizSessionMapper {

    QuizSession map(QuizSessionDto sessionDto);

    QuizSessionDto map(QuizSession session);

}
