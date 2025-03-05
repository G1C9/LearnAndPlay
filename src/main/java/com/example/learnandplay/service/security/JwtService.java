package com.example.learnandplay.service.security;

import com.example.learnandplay.entity.security.User;
import org.springframework.stereotype.Service;

@Service
public interface JwtService {

    String generateRefreshToken(User user);

    String generateAccessToken(User user);

    String extractLogin(String token);

    boolean validateToken(String token, User user);



}
