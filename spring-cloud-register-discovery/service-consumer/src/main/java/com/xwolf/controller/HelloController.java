package com.xwolf.controller;

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

    @GetMapping("hello")
    public String hello(){
        String url = "http://SERVICE-PROVIDER/hello";
        return restTemplate.getForObject(url,String.class);
    }
}
