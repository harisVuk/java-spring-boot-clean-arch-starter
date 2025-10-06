package com.example.java.starter.application.usecase;

import com.example.java.starter.domain.entity.Role;

import java.util.List;

public interface RoleUseCase {
    List<Role> findAll();
    Role createNewRole(Role person);
}
