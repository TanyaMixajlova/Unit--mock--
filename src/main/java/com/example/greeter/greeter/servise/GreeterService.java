package com.example.greeter.greeter.servise;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    private final HelloService helloService;

    public GreeterService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return helloService.randomHello() + ", Anonymous";
        } else {
            return helloService.randomHello() + ", " + name;
        }
    }
}