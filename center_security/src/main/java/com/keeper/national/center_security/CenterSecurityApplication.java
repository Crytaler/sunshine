package com.keeper.national.center_security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.keeper.national.center_security.mapper")
public class CenterSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterSecurityApplication.class, args);
    }

}
