package com.example.servicefeign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("server-hi")
public interface HelloController {

    @RequestMapping(value ="/hi",method = RequestMethod.GET)
    String  HelloClient(@RequestParam(value = "name") String name);
}
