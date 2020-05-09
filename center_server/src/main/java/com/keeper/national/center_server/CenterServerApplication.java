package com.keeper.national.center_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CenterServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(CenterServerApplication.class, args);
    }

}
