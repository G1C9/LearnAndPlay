package com.example.learnandplay.service.security;

import com.example.learnandplay.entity.security.User;
import org.springframework.stereotype.Service;
import javax.security.auth.login.LoginException;

@Service
public interface UserService {

    void registerUser(String username, String login, String password);

    String getRefreshToken(String login);

    void updateRefreshToken(String login, String refreshToken);

    User loadUserByLogin(String login) throws LoginException;

    User findById(Long id);

}
