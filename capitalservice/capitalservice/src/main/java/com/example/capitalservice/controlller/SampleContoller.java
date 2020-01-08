package com.example.capitalservice.controlller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.capitalservice.FeignRestServiceInterface;

@RestController
public class SampleContoller {
    private static final Logger LOG = LoggerFactory.getLogger(SampleContoller.class.getName());
    @Autowired
    private FeignRestServiceInterface restInterface;

    @RequestMapping("/hello")
    public String getMessageFromAnotherMicroservice() {
        LOG.info("Hello MESSAGE SERVICE");
        LOG.info("Hello MESSAGE SERVICE1");
        LOG.info("Hello MESSAGE SERVICE2");
        return restInterface.getMessage();
    }
}
