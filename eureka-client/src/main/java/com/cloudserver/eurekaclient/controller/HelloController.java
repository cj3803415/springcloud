package com.cloudserver.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    public String port;

    @RequestMapping(value = "/hi")

    public String home(@RequestParam String name){
        return "hi"+name+",i am from port:"+port;
    }
}
