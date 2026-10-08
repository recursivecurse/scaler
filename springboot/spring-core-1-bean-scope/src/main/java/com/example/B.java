package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
public class B {

    private A a;

    B(A a)
    {
        System.out.println("Hello from B");
        this.a = a;
    }

}
