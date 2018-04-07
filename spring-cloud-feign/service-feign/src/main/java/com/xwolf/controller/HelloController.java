package com.xwolf.controller;

import com.xwolf.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xwolf
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("say")
    public String sayHello(){
        return helloService.sayHello();
    }
}
