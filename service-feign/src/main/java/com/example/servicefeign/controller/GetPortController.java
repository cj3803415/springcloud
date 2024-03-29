package com.example.servicefeign.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPortController {

    @Autowired
    private HelloController helloController;

    @GetMapping(value = "port")
    public  String getPort(@RequestParam String name){
       return helloController.HelloClient(name);
    }
}
