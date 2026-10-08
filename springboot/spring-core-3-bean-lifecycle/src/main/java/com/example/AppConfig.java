package com.example;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("com.example")
public class AppConfig {

    // @Bean(initMethod="initMethod",destroyMethod = "destroyMethod")
    // public CartExample getCartExample()
    // {
    //     return new CartExample();
    // }

}
