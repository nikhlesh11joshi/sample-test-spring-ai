package com.dailycodebuffer.spring_ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UpiController {
    @GetMapping("/upi")
    public String upiPage()
    {
        System.out.println("UPI page is called-- Adding these chnage in feature-restructuring branch");
        return "upi";
    }
}