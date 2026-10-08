package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")
public class PrototypeExample {

    PrototypeExample()
    {
        System.out.println("Prototype class constructor called");
    }

}
