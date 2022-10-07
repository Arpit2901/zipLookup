package com.welcome.bhavna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping(value = "/display.html")
	public String display() {
		return "welcome.jsp";
	}
}
