package com.example.springboot_4_interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
public class WebConfig implements WebMvcConfigurer{

    private AuthenticationInterceptor authInterceptor;

    WebConfig(AuthenticationInterceptor authenticationInterceptor) { 
        this.authInterceptor = authenticationInterceptor;
    }


    @Override 
    public void addInterceptors(InterceptorRegistry registry) {
        
        registry.addInterceptor(authInterceptor)
                .addPathPatterns("/demo/**")
                .order(1);
    }
}
