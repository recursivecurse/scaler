package com.example;

import org.springframework.stereotype.Component;

@Component 
public class SingletonExample {

    SingletonExample()
    {
        System.out.println("Singleton class constructor called");
    }
}
