package com.example.learnandplay.mapper.sessions;

import com.example.learnandplay.dto.game.sessions.SentenceSessionDto;
import com.example.learnandplay.entity.game.sessions.SentenceSession;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SentenceSessionMapper {

    SentenceSession map(SentenceSessionDto sessionDto);

    SentenceSessionDto map(SentenceSession session);

}
