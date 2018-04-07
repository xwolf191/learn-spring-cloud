package com.xwolf.service;

import com.xwolf.service.fallbackservice.HelloFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xwolf
 **/
@FeignClient(value = "service-provider",fallback = HelloFallbackService.class)
public interface HelloService {

    @RequestMapping("hello")
    String sayHello();
}
