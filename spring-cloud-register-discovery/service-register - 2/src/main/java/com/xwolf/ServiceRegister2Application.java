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
public class ServiceRegister2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegister2Application.class,args);
    }
}
