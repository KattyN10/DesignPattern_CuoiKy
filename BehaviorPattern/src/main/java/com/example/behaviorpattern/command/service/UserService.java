package com.example.behaviorpattern.command.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(String username, String password) {
        System.out.println("Creating user: " + username);
        // Logic để tạo người dùng trong cơ sở dữ liệu
    }

    public void deleteUser(String username) {
        System.out.println("Deleting user: " + username);
        // Logic để xóa người dùng khỏi cơ sở dữ liệu
    }
}
