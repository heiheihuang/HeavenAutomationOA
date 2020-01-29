package com.heaven.controller;

import com.heaven.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "getUser", method = RequestMethod.POST)
    public String getUser(@RequestBody User user) {
        return user.toString();
    }
}
