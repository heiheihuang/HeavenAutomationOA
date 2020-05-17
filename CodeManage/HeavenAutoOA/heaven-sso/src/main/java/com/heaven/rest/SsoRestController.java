package com.heaven.rest;

import com.heaven.entity.User;
import com.heaven.service.HeavenLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsoRestController {

    private final HeavenLogService heavenLogService;

    public SsoRestController(HeavenLogService heavenLogService) {
        this.heavenLogService = heavenLogService;
    }

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public String getUser(@RequestParam String name, @RequestParam String pass) {
        User user = User.builder().name(name).pass(pass).build();
        return heavenLogService.getUser(user);
    }
}
