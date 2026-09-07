package com.example.aws_java_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Java application is running!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from AWS EC2!";
    }
}