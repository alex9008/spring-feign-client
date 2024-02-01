package com.example.feign.client.demofeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemofeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofeignclientApplication.class, args);
	}

}
