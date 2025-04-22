package com.example.learnandplay.service.security.impl;

import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.service.security.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.security.Key;
import java.util.Date;
import java.util.function.Function;
import static com.example.learnandplay.constant.TokenUtils.ACCESS_TOKEN_VALIDITY;
import static com.example.learnandplay.constant.TokenUtils.REFRESH_TOKEN_VALIDITY;

@Service
@Slf4j
public class JwtServiceImpl implements JwtService {

    @Value("${jwt.secret.key}")
    private String secretKey;

    @Override
    public String generateRefreshToken(User user) {
        return Jwts.builder()
                .subject(user.getLogin())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + REFRESH_TOKEN_VALIDITY))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    @Override
    public String generateAccessToken(User user) {
        return Jwts.builder()
                .subject(user.getLogin())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + ACCESS_TOKEN_VALIDITY))
                .signWith(getSignKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    @Override
    public String extractLogin(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    @Override
    public boolean validateToken(String token, User user) {
        String extractedLogin = extractLogin(token);
        log.info("Extracted login from token: {}", extractedLogin);
        return extractedLogin.equals(user.getLogin()) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = Jwts.parser()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claimsResolver.apply(claims);
    }

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
