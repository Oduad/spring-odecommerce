package com.curso.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class OdiEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdiEcommerceApplication.class, args);
		System.out.println("Fuck yeah!");
	}

}
