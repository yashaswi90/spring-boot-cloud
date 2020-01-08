package com.example.capitalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.capitalservice.config.RibbonConfiguration;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RibbonClient(name = "message-service")
public class CapitalserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapitalserviceApplication.class, args);
	}

}
