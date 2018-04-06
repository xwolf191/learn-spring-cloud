package com.xwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xwolf
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceDiscoveryApplication{

    public static void main( String[] args ) {
        SpringApplication.run(ServiceDiscoveryApplication.class,args);
    }
}
