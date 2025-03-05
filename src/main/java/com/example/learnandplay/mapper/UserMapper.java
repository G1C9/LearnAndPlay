package com.example.learnandplay.mapper;

import com.example.learnandplay.dto.security.UserDto;
import com.example.learnandplay.entity.security.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserDto map(User user);

    User map(UserDto userDto);

}
