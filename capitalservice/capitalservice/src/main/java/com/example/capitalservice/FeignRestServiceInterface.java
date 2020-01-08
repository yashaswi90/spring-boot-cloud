package com.example.capitalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "message-service")
public interface FeignRestServiceInterface {
    @GetMapping("/helloservice")
    public String getMessage();
}
