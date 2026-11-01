package greeter.servise;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    // Данный класс не отличается от класса Greeter в предыдущем примере
    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Anonymous";
        } else {
            return "Hello, " + name;
        }
    }
}