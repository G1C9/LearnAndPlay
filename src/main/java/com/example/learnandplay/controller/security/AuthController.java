package com.example.learnandplay.controller.security;

import com.example.learnandplay.dto.security.LoginDto;
import com.example.learnandplay.dto.security.RefreshDto;
import com.example.learnandplay.dto.security.RegisterDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import javax.security.auth.login.LoginException;

@RestController
@RequestMapping("/api/auth")
public interface AuthController {

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> register(@RequestBody @Valid RegisterDto registerDto);

    @PostMapping("/login")
    ResponseEntity<?> login(@RequestBody @Valid LoginDto loginDto) throws LoginException;

    @PostMapping("/refresh")
    ResponseEntity<?> refresh(@RequestBody RefreshDto refreshDto) throws LoginException;

}
