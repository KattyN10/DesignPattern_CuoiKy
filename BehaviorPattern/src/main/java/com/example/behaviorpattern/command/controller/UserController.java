package com.example.behaviorpattern.command.controller;

import com.example.behaviorpattern.command.dto.CreateUserRequest;
import com.example.behaviorpattern.command.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/command")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody CreateUserRequest request) {
        userService.createUser(request.getUsername(), request.getPassword());
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable String username) {
        userService.deleteUser(username);
    }
}

