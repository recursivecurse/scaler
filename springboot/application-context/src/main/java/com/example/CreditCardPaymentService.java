package com.example;

import org.springframework.stereotype.Component;



public class CreditCardPaymentService implements PaymentService{

    public void pay(){
        System.out.println("Paying through credit card ");
    }
}
