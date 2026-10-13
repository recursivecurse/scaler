package com.example;

public class Main {
    public static void main(String[] args) {
        
        PaymentService paymentService = new PaymentService();

        OrderService orderService = new OrderService(paymentService); //Injecting dependency manually

        orderService.placeOrder();


    }
}