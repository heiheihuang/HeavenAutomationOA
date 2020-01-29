package com.heaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages="com.heaven.*")
public class HeavenEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeavenEurekaApplication.class, args);
    }

}
