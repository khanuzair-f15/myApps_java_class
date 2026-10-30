package com.example.myApps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/check")

    public String check() {
        return "fine";
    }
}
