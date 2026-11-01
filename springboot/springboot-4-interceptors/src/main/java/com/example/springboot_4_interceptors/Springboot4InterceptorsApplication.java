package com.example.springboot_4_interceptors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class Springboot4InterceptorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot4InterceptorsApplication.class, args);
	}

}
