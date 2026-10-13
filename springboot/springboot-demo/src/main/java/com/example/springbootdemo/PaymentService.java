package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class PaymentService {

    @Value("UPI")
    private String type;

    public void pay()
    {
        System.out.println("Paying through "+ type );
    }
}
