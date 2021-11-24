package com.Properties.Properties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PropertiesController {

    @Value("${app.name:Defalut Demo App}")
    private String appName;

    @GetMapping("/student")
    @ResponseBody
    public String getStudent() {
        return appName;
    }

}
