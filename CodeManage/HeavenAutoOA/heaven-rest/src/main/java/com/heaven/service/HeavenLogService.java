package com.heaven.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server-heaven-log",path ="/heaven/log" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface HeavenLogService {

    @RequestMapping(value = "getUser")
    String getUser();
}
