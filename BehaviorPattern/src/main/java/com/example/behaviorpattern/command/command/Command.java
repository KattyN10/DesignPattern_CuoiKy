package com.example.behaviorpattern.command.command;

import com.example.behaviorpattern.command.service.UserService;

public interface Command {
    void execute(UserService userService);
}