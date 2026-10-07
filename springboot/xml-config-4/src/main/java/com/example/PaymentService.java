package com.example;

import java.util.List;

public class PaymentService {

    private String type;
    private int retryCount;
    private List<Integer> list;
    PaymentService(String name, int count, List<Integer> list)
    {
        this.type = name;
        this.retryCount = count;
        this.list = list;
    }
    public void pay()
    {
        System.out.println("Processing payment through "+ type + " with "+ retryCount+" counts");
    }
}
