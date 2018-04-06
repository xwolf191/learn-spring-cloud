package com.xwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xwolf
 **/
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegisterApplication.class,args);
    }
}
