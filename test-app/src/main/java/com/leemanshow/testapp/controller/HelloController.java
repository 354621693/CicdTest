package com.leemanshow.testapp.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leewencan
 * @date 2022/8/8 15:50
 */
@RestController
public class HelloController {
    @GetMapping("/manshow/hi")
    public String aa(){
        return "hello !!!!!！！！!";
    }
    @PostMapping("/manshow/{ss}")
    public String aa1(@RequestBody SS ss){
        System.out.println(ss.b);
        return "测测测 !!!!!！！！!";
    }
}
