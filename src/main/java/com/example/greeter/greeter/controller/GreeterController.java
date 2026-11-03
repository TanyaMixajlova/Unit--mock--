package com.example.greeter.greeter.controller;

import com.example.greeter.greeter.servise.GreeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeter")
public class GreeterController {
    private final GreeterService greeterService;

    // Сервис создается Springом и мы получаем его в качестве бина
    public GreeterController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    // При запросе localhost:8080/greeter?name=test - получим "Hello, test".
    // При запросе без параметров localhost:8080/greeter -
    // получим "Hello, Anonymous".
    @GetMapping
    // required=false в аннотации @RequestParam означает
    // что данный параметр может принимать значение null
    // или быть пустой строкой
    public String greet(@RequestParam(name = "name",
            required = false) String name) {
        return greeterService.greet(name);
    }
}