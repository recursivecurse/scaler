package com.example.springboot1;

import org.springframework.stereotype.Component;

@Component 
public class PaymentGateway {

    private PaymentProperties paymentProperties;

    
    PaymentGateway(PaymentProperties paymentProperties)
    {
        this.paymentProperties = paymentProperties;
    }

    public PaymentProperties getPaymentProperties() {
        return paymentProperties;
    }

    public void setPaymentProperties(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }

    public void print()
    {
        System.out.println(paymentProperties.getType());
        System.out.println(paymentProperties.getRetryCount());
        System.out.println(paymentProperties.isEnabled());
    }

    
}
