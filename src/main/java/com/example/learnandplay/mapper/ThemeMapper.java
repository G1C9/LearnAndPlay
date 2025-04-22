package com.example.learnandplay.mapper;

import com.example.learnandplay.dto.game.ThemeDto;
import com.example.learnandplay.entity.game.Theme;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ThemeMapper {

    Theme map(ThemeDto themeDto);

    List<ThemeDto> map(List<Theme> theme);

}
