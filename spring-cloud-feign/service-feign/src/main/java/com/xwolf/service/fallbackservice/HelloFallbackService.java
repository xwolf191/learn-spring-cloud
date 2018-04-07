package com.xwolf.service.fallbackservice;

import com.xwolf.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author xwolf
 **/
@Component
public class HelloFallbackService implements HelloService {

    @Override
    public String sayHello() {
        return "service feign error";
    }
}
