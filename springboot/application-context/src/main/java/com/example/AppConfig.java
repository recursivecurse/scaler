package com.example;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan 
public class AppConfig {


    @Bean
    public User getUser()
    {
        return new User("Aditya");
    }
}
