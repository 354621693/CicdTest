package com.leemanshow.testapp.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface TestFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/health", consumes = MediaType.APPLICATION_JSON_VALUE)
    String health();

    @RequestMapping(method = RequestMethod.GET, value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    String test();
}
