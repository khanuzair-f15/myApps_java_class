package com.example.myApps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check {
    @RequestMapping("/run")
    public static void main() {
        System.out.println("GG its working!");
    }
}
