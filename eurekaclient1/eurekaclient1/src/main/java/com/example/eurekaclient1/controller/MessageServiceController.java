package com.example.eurekaclient1.controller;


import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageServiceController {
    private static final Logger LOG = Logger.getLogger(MessageServiceController.class.getName());
    HashMap<Integer, Integer> timePort = new HashMap<>();
    @Autowired
    private Environment environment;

    @GetMapping("/helloService")
    public String getMessage() {
        LOG.log(Level.INFO, "here message service");
        int port = Integer.parseInt(environment.getProperty("local.server.port"));
        System.out.println("port  is" + port);
        int time = timePort.getOrDefault(port, 0);
        if (time >= 0) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "Yashaswi,how are you";

    }

    @GetMapping("/time/{time}")
    public int getTime(@PathVariable int time) {
        int port = Integer.parseInt(environment.getProperty("local.server.port"));
        timePort.put(port, time);
        return time;
    }
}
