package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

public class OrderService {

    
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
