package com.example.java.starter.application.usecase;

import com.example.java.starter.domain.entity.User;

import java.util.List;

public interface UserUseCase {

    List<User> findAll();
    User createNewUser(User person);
}
