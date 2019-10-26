package com.example.dockerdemo.service.impl;

import com.example.dockerdemo.dao.UserRepository;
import com.example.dockerdemo.entity.User;
import com.example.dockerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser() {
        User user = new User();
        user.setName("lijun");
        return userRepository.save(user);
    }
}
