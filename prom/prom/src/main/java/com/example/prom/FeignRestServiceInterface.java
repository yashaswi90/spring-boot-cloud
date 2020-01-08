package com.example.prom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="message-service")
public interface FeignRestServiceInterface {

    @GetMapping("/helloService")
    public String getMessage();
}
