package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        // PaymentService paymentService = (PaymentService)context.getBean("paymentService");

        OrderService orderService =  context.getBean(OrderService.class);
        orderService.order();
        
        User user = context.getBean("user",User.class);
        
        context.close();
    }
}