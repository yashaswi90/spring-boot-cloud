package com.example.gatewayex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GatewayexApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayexApplication.class, args);
	}

}
