package com.example.dockerdemo.controller;

import com.example.dockerdemo.entity.User;
import com.example.dockerdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @Value("${env}")
    private String env;

    private UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String sayHello() {
        log.info("Calling hello controller! at {}, on {}", System.currentTimeMillis(), env);
        User user = userService.createUser();
        log.info("user created {}", user.getName());
        return "hello docker demo at: " + env;
    }
}
