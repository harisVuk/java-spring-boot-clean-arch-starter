package com.example.java.starter.presentation.Controllers;


import com.example.java.starter.application.usecase.impl.RoleUseCaseImpl;
import com.example.java.starter.domain.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {

    @Autowired
    private RoleUseCaseImpl roleService;

    @GetMapping("/roles")
    private List<Role> getRoles() {
        return roleService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Role createRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }

}
