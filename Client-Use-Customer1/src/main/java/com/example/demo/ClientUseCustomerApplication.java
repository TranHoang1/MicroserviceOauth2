package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EntityScan(basePackages = "Models")
@EnableResourceServer
public class ClientUseCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientUseCustomerApplication.class, args);
	}

}
