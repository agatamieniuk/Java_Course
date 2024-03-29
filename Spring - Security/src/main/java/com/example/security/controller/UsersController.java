package com.example.security.controller;

import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    private final UserService userService;

    public UsersController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "users";
    }
}
