package com.example.learnandplay.mapper.sessions;

import com.example.learnandplay.dto.game.sessions.DrugAndDropSessionDto;
import com.example.learnandplay.entity.game.sessions.DrugAndDropSession;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DrugAndDropSessionMapper {

    DrugAndDropSession map(DrugAndDropSessionDto sessionDto);

    DrugAndDropSessionDto map(DrugAndDropSession session);

}
