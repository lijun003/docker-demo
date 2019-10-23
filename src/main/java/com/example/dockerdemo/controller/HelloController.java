package com.example.dockerdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
@Slf4j
public class HelloController {
    @Value("${env}")
    private String env;

    @GetMapping
    public String sayHello() {
        log.info("Calling hello controller! at {}, on {}", System.currentTimeMillis(), env);
        return "hello docker demo at: " + env;
    }
}
