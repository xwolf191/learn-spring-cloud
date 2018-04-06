package com.xwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xwolf
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceProviderApplication{

    public static void main( String[] args ) {
        SpringApplication.run(ServiceProviderApplication.class,args);
    }
}
