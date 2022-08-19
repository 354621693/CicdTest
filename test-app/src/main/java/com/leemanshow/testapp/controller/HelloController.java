package com.leemanshow.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leewencan
 * @date 2022/8/8 15:50
 */
@RestController
public class HelloController {
    @GetMapping("/manshow/hi")
    public String aa(){
        return "hello !!!!!！!";
    }
}
