package com.example.journal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

    @GetMapping("/main")
    public String Main() {

        return "app/main";
    }

    @GetMapping("/profile")
    public String Profile() {

        return "app/profile";
    }
}