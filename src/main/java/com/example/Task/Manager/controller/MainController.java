package com.example.Task.Manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("/")
    public String home(Model model){
        model.addAttribute("pageTitle","Task Manager");
        return "home";
    }
}
