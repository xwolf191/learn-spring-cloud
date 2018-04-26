package com.xwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author  xwolf
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {


    public static void main( String[] args )
    {
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
