package com.adarsh.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "HELLO HELLO";
    }

    @RequestMapping("logina")
    public String logina(){
        return "logina";
    }
}
