package com.glauberperez.blog.controller;

import com.glauberperez.blog.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.glauberperez.blog.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("listUsers", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/register")
    public String registerUser(Model model){
        UserModel user = new UserModel();

        model.addAttribute("user", user);

        return("register");
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute("user") UserModel user){
        userService.register(user);
        return("redirect:/");
    }


}
