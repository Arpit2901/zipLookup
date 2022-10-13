package com.bhavna.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
    @RequestMapping("/display.html")
    public String display() {
        return "check";
    }
}

