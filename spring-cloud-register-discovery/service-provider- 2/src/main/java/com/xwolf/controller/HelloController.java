package com.xwolf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xwolf
 **/
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @GetMapping("hello")
    public String hello(){
        ServiceInstance serviceInstance = client.getInstances("service-provider-2").get(0);
        log.info("host={},port={},serviceId={},metaData={},uri={}",
                serviceInstance.getHost(),
                serviceInstance.getPort(),
                serviceInstance.getServiceId(),
                serviceInstance.getMetadata(),
                serviceInstance.getUri());
        return "Hello Spring Cloud";
    }
}
