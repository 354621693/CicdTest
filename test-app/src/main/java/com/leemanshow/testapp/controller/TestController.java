package com.leemanshow.testapp.controller;

import com.leemanshow.testapp.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

    @Autowired
    TestFeignClient serviceClient;

    @GetMapping("/server_health")
    public String health_server(){
        log.info("client->server health");
        return serviceClient.health();
    }

    @GetMapping("/server_test")
    public String test_server(){
        log.info("client->server test");
        return serviceClient.test();
    }

    @GetMapping("/health")
    public String health(){
        log.info("client health");
        return "health3";
    }

    @GetMapping("/test")
    public String test(){
        log.info("client test");
        return "test";
    }
}