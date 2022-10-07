package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/home.html")
	public String home() {
		System.out.println("Hello in home");
		return "index2";
	}
}