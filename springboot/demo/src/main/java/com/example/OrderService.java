package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired 
    private PaymentService paymentService;

    OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void placeOrder()
    {
        System.out.println("Items added to cart ");
        System.out.println("Taking you to payment gateway ");

        paymentService.pay();

    }

}
