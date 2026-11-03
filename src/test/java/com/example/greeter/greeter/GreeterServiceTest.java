package com.example.greeter.greeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.greeter.greeter.servise.GreeterService;

public class GreeterServiceTest {
    // Так как Spring в этом тесте не создает бины и не управляет контекстом
    // нам нужно создать GreeterService вручную, используя ключевое слово new
    private final GreeterService greeterService = new GreeterService();

    // В тестах мы обращаемся к полю тестового класса greeterService.
    // Так как тестовые классы - такие же классы, то для них выполняются
    // те же самые правила, например можно объявлять поля и обращаться к ним.
    @Test
    void whenNameIsGiven_ThenGreeterReturnsHelloName() {
        String name = "Test";
        Assertions.assertEquals("Hello, Test", greeterService.greet(name));
    }

    @Test
    void whenNameIsNull_ThenGreeterReturnsHelloAnonymous() {
        String name = null;
        Assertions.assertEquals("Hello, Anonymous", greeterService.greet(name));
    }

    @Test
    void whenNameIsEmpty_ThenGreeterReturnsHelloAnonymous() {
        String name = "";
        Assertions.assertEquals("Hello, Anonymous", greeterService.greet(name));
    }
}