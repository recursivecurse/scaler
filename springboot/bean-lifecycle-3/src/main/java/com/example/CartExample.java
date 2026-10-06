package com.example;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("cartExample")
public class CartExample implements BeanNameAware  /* , InitializingBean , DisposableBean*/{

    private Map<String,Integer> map ;

    public Map<String, Integer> getMap() {
        return map;
    }

    CartExample()
    {
       this.map = new HashMap<>();
       System.out.println("Cart constructor is called");
    }

    @Override
    public void setBeanName(String name) {
        // TODO Auto-generated method stub
        System.out.println("Bean name is "+ name);
    }

    //Post initialization

    // @Override 
    // public void afterPropertiesSet() throws Exception {
    //     // TODO Auto-generated method stub
    //     map.put("Aditya",1);
    //     map.put("Abhishek",2);

    // }

    public void initMethod(){
        
        map.put("Aditya",1);
        map.put("Abhishek",2);
    }

    @PostConstruct
    public void postConstructMethod()
    {
        map.put("Aditya",1);
        map.put("Abhishek",2);
    }

    //Before destruction of bean
    // @Override
    // public void destroy() throws Exception {
    //     // TODO Auto-generated method stub
    //     System.out.println("The bean is getting destroyed");
    // }

    public void destroyMethod()
    {
        System.out.println("The bean is getting destroyed");
    }

    @PreDestroy 
    public void preDestroyMethod()
    {
        map.put("Aditya",1);
        map.put("Abhishek",2);
    }

}
