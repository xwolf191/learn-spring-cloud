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
public class ServiceProvider2Application{

    public static void main( String[] args ) {
        SpringApplication.run(ServiceProvider2Application.class,args);
    }
}
