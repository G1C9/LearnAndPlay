package com.example.learnandplay.mapper.sessions;

import com.example.learnandplay.dto.game.sessions.TypingSessionDto;
import com.example.learnandplay.entity.game.sessions.TypingSession;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TypingSessionMapper {

    TypingSession map(TypingSessionDto typingSessionDto);

    TypingSessionDto map(TypingSession typingSession);

}
