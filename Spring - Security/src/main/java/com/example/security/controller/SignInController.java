package com.example.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/sign-in")
    public String signIn(){
        return "sign-in";
    }
//    @GetMapping("/sign-in")
//    public String signIn() {
//        return "sign-in";
//    }
}
