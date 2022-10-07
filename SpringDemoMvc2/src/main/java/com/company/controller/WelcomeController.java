package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WelcomeController {
    @RequestMapping("/display.html")
    public String display() {
        return "NewFile.jsp";
    }
}
