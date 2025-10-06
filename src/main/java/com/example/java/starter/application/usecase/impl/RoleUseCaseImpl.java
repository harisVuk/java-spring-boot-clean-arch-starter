package com.example.java.starter.application.usecase.impl;

import com.example.java.starter.application.usecase.RoleUseCase;
import com.example.java.starter.application.usecase.UserUseCase;
import com.example.java.starter.domain.entity.Role;
import com.example.java.starter.domain.entity.User;
import com.example.java.starter.infrastructure.repository.RoleRepository;
import com.example.java.starter.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleUseCaseImpl implements RoleUseCase {

    private final RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }


}
