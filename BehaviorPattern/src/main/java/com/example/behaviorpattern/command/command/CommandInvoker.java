package com.example.behaviorpattern.command.command;

import com.example.behaviorpattern.command.service.UserService;

public class CommandInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(UserService userService) {
        command.execute(userService);
    }
}

