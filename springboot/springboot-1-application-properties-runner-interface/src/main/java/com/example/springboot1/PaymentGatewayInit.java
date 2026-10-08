package com.example.springboot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class PaymentGatewayInit implements /*ApplicationRunner*/ CommandLineRunner{

    private PaymentGateway paymentGateway;

    
    @Autowired
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        paymentGateway.print();    
    }



    // @Override
    // public void run(ApplicationArguments args) throws Exception {
    //     paymentGateway.print();

    // }

}
