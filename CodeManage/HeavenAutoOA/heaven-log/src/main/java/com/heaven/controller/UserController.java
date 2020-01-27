package com.heaven.controller;

import com.heaven.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "getUser")
    public String getUser() {
        User user = new User();
        user.setName("huang dan yang");
        user.setPass("8635766");
        return user.toString();
    }
}
