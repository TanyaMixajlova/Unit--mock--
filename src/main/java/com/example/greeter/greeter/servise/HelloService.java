package com.example.greeter.greeter.servise;

import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private final Random random = new Random();

    public String randomHello() {
        return switch (random.nextInt(1, 5)) {
            case 1 -> "Привет";
            case 2 -> "Hallo";
            case 3 -> "Salut";
            default -> "Hello";
        };
    }
}