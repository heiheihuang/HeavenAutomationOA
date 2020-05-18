package com.heaven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//扫描DAO
@MapperScan(basePackages = {"com.heaven.dao"})
public class HeavenSsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeavenSsoApplication.class, args);
    }
}
