package com.security.s_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contacts")
    public String contactsDetails(){
        return "Contacts us on 076 382 3711";
    }
}
