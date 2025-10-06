package com.example.java.starter.presentation.Controllers;

import com.example.java.starter.application.usecase.impl.UserUseCaseImpl;
import com.example.java.starter.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserUseCaseImpl userService;

    @GetMapping("/users")
    private List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private User createUser(@RequestBody User user) {
        return userService.createNewUser(user);
    }

}
