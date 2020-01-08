package com.example.prom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.prom.config.RibbonConfiguration;


@SpringBootApplication
@EnableFeignClients
@RibbonClient(name = "message-service", configuration = RibbonConfiguration.class)
public class PromApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromApplication.class, args);
    }

}
