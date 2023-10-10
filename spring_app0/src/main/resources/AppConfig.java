package ru.artem.spring_app0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloBean helloBean() {
        return new HelloBean("Hello, World!");
    }
}