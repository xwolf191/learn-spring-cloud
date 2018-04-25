package com.xwolf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xwolf
 **/
@RestController
public class ConfigController {

    @Value("${application.name}")
    private  String name;
    @Value("${desc}")
    private  String desc;

    @GetMapping("config")
    public String client(){
        return String.format("name=%s,desc=%s",name,desc);
    }

}
