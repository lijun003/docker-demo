package com.example.dockerdemo.service;

import com.example.dockerdemo.entity.User;

import java.util.List;

public interface UserService {
    User createUser();

    List<User> getUsers();
}
