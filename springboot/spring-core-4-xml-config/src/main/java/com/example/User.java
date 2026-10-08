package com.example;

public class User {

    private PaymentService paymentService;
    User()
    {
        System.out.println("User constructor is called");
    }

    public void setPaymentService(PaymentService paymentService){

        this.paymentService = paymentService;
    }
    
    public void init()
    {
        System.out.println("Post Construct method called");
    }

    public void cleanup()
    {
        System.out.println("Pre Destroy is getting called");
    }
}
