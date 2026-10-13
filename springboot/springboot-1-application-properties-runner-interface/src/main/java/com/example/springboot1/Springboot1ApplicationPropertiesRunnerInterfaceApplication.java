package com.example.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot1ApplicationPropertiesRunnerInterfaceApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Springboot1ApplicationPropertiesRunnerInterfaceApplication.class, args);
		
		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
		paymentGateway.print();

		PaymentGateway2 paymentGateway2 = context.getBean(PaymentGateway2.class);
		paymentGateway2.print();


	}

}
