package com.heaven.service;

import com.heaven.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "server-heaven-log",path ="/heaven/log" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface HeavenLogService {

    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    String getUser(@RequestBody User user);
}
