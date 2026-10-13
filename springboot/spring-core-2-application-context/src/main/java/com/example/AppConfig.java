package com.example;

import java.beans.BeanProperty;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan 
public class AppConfig {


    @Bean
    public User getUser()
    {
        return new User("Aditya");
    }


    @Bean 
    public OrderService getOrderService(@Qualifier("creditCardPayment") PaymentService paymentService)
    {
        return new OrderService(paymentService);
    }

    

    @Bean
    @Qualifier("creditCardPayment")
    public PaymentService getCreditCardPaymentService()
    {
        return new CreditCardPaymentService();
    }

}
