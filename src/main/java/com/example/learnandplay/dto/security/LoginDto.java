package com.example.learnandplay.dto.security;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotBlank(message = "Enter the login")
    @Size(min = 2, max = 40)
    private String login;

    @NotBlank(message = "Enter the password")
    @Size(min = 2, max = 30)
    private String password;

}
