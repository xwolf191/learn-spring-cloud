package com.xwolf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xwolf
 **/
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 容错,异常调用fallHello方法
     * @return
     */
    @GetMapping("hello")
    @HystrixCommand(fallbackMethod = "fallHello" )
    public String hello(){
        String url = "http://SERVICE-PROVIDER/hello";
        return restTemplate.getForObject(url,String.class);
    }

    public String fallHello(){
        return "server error";
    }
}
