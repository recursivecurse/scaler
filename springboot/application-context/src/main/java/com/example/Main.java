package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean(User.class);
        System.out.println(user.getName());

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}