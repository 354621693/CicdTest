package com.leemanshow.testapp.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("kesapp")//, fallback = UserClientFallback.class
public interface TestFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/health", consumes = MediaType.APPLICATION_JSON_VALUE)
    String health();

    @RequestMapping(method = RequestMethod.GET, value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    String test();
}
