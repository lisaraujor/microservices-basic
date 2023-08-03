package com.microservices.initialservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InitialServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialServiceApplication.class, args);
	}

}
