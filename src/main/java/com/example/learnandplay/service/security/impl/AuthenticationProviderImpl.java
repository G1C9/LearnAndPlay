package com.example.learnandplay.service.security.impl;

import com.example.learnandplay.entity.security.User;
import com.example.learnandplay.service.security.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import javax.security.auth.login.LoginException;

@Component
@RequiredArgsConstructor
public class AuthenticationProviderImpl implements AuthenticationProvider {

    private final UserService userService;

    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String rawPassword = authentication.getCredentials().toString();

        try {
            User user = userService.loadUserByLogin(login);

            if (user == null || !passwordEncoder.matches(rawPassword, user.getPassword())) {
                throw new BadCredentialsException("Неверный логин или пароль");
            }

            return new UsernamePasswordAuthenticationToken(user, null,
                    user.getRoles().stream().map(SimpleGrantedAuthority::new).toList());

        } catch (LoginException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
