package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class SingletonExample {

    private String name;
    SingletonExample(@Value("Aditya") String name)
    {
        this.name = name;
        System.out.println("Singleton class constructor called " + name);
    }
}
