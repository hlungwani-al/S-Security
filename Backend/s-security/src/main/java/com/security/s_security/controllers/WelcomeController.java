package com.security.s_security.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "welcome to spring security";
    }
}
