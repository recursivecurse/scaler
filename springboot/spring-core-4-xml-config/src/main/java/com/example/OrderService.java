package com.example;

public class OrderService {

    private PaymentService paymentService;

    OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void order()
    {
        paymentService.pay();
    }

}
