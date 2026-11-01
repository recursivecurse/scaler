package com.example.springboot_3_filters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Springboot3FiltersApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3FiltersApplication.class, args);
	}

}
