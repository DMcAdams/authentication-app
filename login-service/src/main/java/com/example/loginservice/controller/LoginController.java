package com.example.loginservice.controller;

import com.example.loginservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/register")
    public void register(){
        loginService.register();
    }

    @PostMapping("/login")
    public void login(){
        loginService.login();
    }

}
