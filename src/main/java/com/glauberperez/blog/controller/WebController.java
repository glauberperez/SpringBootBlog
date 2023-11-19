package com.glauberperez.blog.controller;

import com.glauberperez.blog.model.PostModel;
import com.glauberperez.blog.model.UserModel;
import com.glauberperez.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.glauberperez.blog.service.UserService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String homePage(Model model){
        PostModel post = new PostModel();

        model.addAttribute("post", post);

        model.addAttribute("listPost", postService.getAllPosts());
        
        return "feed";
    }

    @PostMapping("/")
    public String publish(@ModelAttribute("post") PostModel post){

        postService.publish(post);

        return "feed";
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
