package com.example.learnandplay.service.security.impl;

import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.repository.security.UserRepository;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.security.auth.login.LoginException;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(String username, String login, String password) {
        User user = User.builder()
                .userName(username)
                .login(login)
                .password(passwordEncoder.encode(password))
                .roles(Set.of("ROLE_USER"))
                .build();
        userRepository.save(user);
    }

    @Override
    public String getRefreshToken(String login) {
        return userRepository.findByLogin(login)
                .map(User::getRefreshToken)
                .orElse(null);
    }

    @Override
    public void updateRefreshToken(String login, String refreshToken) {
        userRepository.findByLogin(login).ifPresent(user -> {
            log.info("Updating refresh token for user: {}", login);
            user.setRefreshToken(refreshToken);
            userRepository.save(user);
            log.info("Refresh token updated for user: {}", login);
        });
    }


    @Override
    public User loadUserByLogin(String login) throws LoginException {
        return userRepository.findByLogin(login)
                .orElseThrow(() -> new LoginException("User not found with: " + login));
    }

}
