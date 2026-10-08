package com.example.springboot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class PaymentGateway2 {

    @Value("${payment-gateway-properties.type}")
    private String type;

    @Value("${payment-gateway-properties.retry-count}")
    private int retryCount;

    @Value("${payment-gateway-properties.enabled}")
    private boolean enabled;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public void print()
    {
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
    }

}
