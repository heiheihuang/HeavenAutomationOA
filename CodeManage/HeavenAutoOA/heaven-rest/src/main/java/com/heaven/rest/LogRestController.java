package com.heaven.rest;

import com.heaven.service.HeavenLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {

    private final HeavenLogService heavenLogService;

    public LogRestController(HeavenLogService heavenLogService) {
        this.heavenLogService = heavenLogService;
    }

    @RequestMapping(value = "getUser")
    public String getUser() {
        return heavenLogService.getUser();
    }
}
