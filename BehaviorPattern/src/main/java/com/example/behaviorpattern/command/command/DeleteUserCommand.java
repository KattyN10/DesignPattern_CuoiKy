package com.example.behaviorpattern.command.command;

import com.example.behaviorpattern.command.service.UserService;

public class DeleteUserCommand implements Command {
    private String username;

    public DeleteUserCommand(String username) {
        this.username = username;
    }

    @Override
    public void execute(UserService userService) {
        userService.deleteUser(username);
    }
}
