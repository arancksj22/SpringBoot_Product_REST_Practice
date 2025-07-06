package com.example.DemoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @RequestMapping("/")
    public String welcome(){
        return "welcomeeeee";
    }

    @RequestMapping("/about")
    public int about(){
        return 128432982;
    }

}