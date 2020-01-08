package com.example.prom.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prom.FeignRestServiceInterface;

import io.micrometer.core.annotation.Timed;

@RestController
public class SampleContoller {
    private static final Logger LOG = LoggerFactory.getLogger(SampleContoller.class.getName());
    @Autowired
    private FeignRestServiceInterface restInterface;

    @RequestMapping("/hello")
//    @Timed("hello")
    public String getMessageFromAnotherMicroservice() {
        LOG.info("Hello MESSAGE SERVICE");
        return restInterface.getMessage();
    }
}
