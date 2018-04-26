package com.xwolf.service.fallback;

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
