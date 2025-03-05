package com.example.learnandplay.dto.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;

    private String userName;

    private String login;

    private String password;

    private String refreshToken;

    private int level = 1;

    private Set<String> roles;

}
