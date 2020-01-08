package com.example.kafkaexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaexample.service.ApacheKafkaSender;

@RestController
@RequestMapping("/kafka-sample")
public class ApacheKafkaController {

    @Autowired
    private ApacheKafkaSender apacheKafkaSender;

    @GetMapping(value="/producer")
    public void producer(@RequestParam("message") String message) {
        apacheKafkaSender.send(message);

    }
}
