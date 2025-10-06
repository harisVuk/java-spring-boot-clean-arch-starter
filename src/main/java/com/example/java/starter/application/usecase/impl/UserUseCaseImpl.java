package com.example.java.starter.application.usecase.impl;

import com.example.java.starter.application.usecase.UserUseCase;
import com.example.java.starter.domain.entity.User;
import com.example.java.starter.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserUseCaseImpl implements UserUseCase {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User createNewUser(User user) {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder(12);

        user.setPassword(bc.encode(user.getPassword()));

        return userRepository.save(user);
    }

}
