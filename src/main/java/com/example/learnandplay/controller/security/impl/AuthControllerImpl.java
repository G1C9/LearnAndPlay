package com.example.learnandplay.controller.security.impl;

import com.example.learnandplay.controller.security.AuthController;
import com.example.learnandplay.dto.security.RefreshDto;
import com.example.learnandplay.dto.security.AuthDto;
import com.example.learnandplay.dto.security.LoginDto;
import com.example.learnandplay.dto.security.RegisterDto;
import com.example.learnandplay.dto.security.UserDto;
import com.example.learnandplay.mapper.UserMapper;
import com.example.learnandplay.service.security.JwtService;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RestController;
import javax.security.auth.login.LoginException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class AuthControllerImpl implements AuthController {

    private final UserService userService;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    private final UserMapper userMapper;

    @Override
    public ResponseEntity<?> register(RegisterDto registerDto) {
        userService.registerUser(registerDto.getUsername(), registerDto.getLogin(), registerDto.getPassword());
        log.info("User registered successfully");
        return ResponseEntity.ok("User registered successfully");
    }

    @Override
    public ResponseEntity<?> login(LoginDto loginDto) throws LoginException {
        log.info("Login attempt: {}", loginDto.getLogin());

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getLogin(), loginDto.getPassword())
            );
            log.info("Authentication successful");
        } catch (BadCredentialsException e) {
            log.info("Authentication failed: Invalid password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid password");
        }
        log.info("Authentication successful");

        UserDto userDto = userMapper.map(userService.loadUserByLogin(loginDto.getLogin()));
        log.info("User loaded: {}", userDto.getLogin());

        String existingRefreshToken = userService.getRefreshToken(loginDto.getLogin());
        log.info("Existing refresh token: {}", existingRefreshToken);

        boolean isRefreshTokenValid = existingRefreshToken != null && jwtService.validateToken(existingRefreshToken, userMapper.map(userDto));
        log.info("Is refresh token valid: {}", isRefreshTokenValid);

        String refreshToken = isRefreshTokenValid ? existingRefreshToken : jwtService.generateRefreshToken(userMapper.map(userDto));

        if (existingRefreshToken == null || !isRefreshTokenValid) {
            userService.updateRefreshToken(userDto.getLogin(), refreshToken);
        }

        String accessToken = jwtService.generateAccessToken(userMapper.map(userDto));
        log.info("Tokens generated successfully");

        return ResponseEntity.ok(new AuthDto(accessToken, refreshToken));
    }


    @Override
    public ResponseEntity<?> refresh(RefreshDto refreshDto) throws LoginException {
        String login = jwtService.extractLogin(refreshDto.getRefreshToken());
        UserDto userDto = userMapper.map(userService.loadUserByLogin(login));

        if (!jwtService.validateToken(refreshDto.getRefreshToken(), userMapper.map(userDto))) {
            log.info("Refresh token expired, generating a new one");
            String newRefreshToken = jwtService.generateRefreshToken(userMapper.map(userDto));
            userService.updateRefreshToken(login, newRefreshToken);
            String newAccessToken = jwtService.generateAccessToken(userMapper.map(userDto));
            return ResponseEntity.ok(new AuthDto(newAccessToken, newRefreshToken));
        }

        String newAccessToken = jwtService.generateAccessToken(userMapper.map(userDto));
        return ResponseEntity.ok(new AuthDto(newAccessToken, refreshDto.getRefreshToken()));
    }
}
