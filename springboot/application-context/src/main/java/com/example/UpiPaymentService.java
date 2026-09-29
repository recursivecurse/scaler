package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("singleton")
@Primary
public class UpiPaymentService implements PaymentService{

    public void pay()
    {
        System.out.println("Paying through UPI");
    }

}
