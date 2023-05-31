package com.example.behaviorpattern.command.command;

import com.example.behaviorpattern.command.service.UserService;

public class CreateUserCommand implements Command {
    private String username;
    private String password;

    public CreateUserCommand(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void execute(UserService userService) {
        userService.createUser(username, password);
    }
}


