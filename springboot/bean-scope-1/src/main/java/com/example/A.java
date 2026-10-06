package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component 

public class A {

    private B b;

    A(@Lazy B b){
        System.out.println("Hello from A");
        this.b = b;
    }
}
