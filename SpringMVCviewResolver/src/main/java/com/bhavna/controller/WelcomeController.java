package com.bhavna.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/display.html")
	public String display() {
		return "welcome";
	}


	public String display(HttpServletRequest req, Model m) {
			System.out.println("in method");

			String name = req.getParameter("name");
			int pass = Integer.parseInt(req.getParameter("age"));
			if (pass > 18) {
				String msg = "Hello " + name + " you are eligible for voting";
				m.addAttribute("message", msg);
				return "viewpage";

			} else {
				String msg = "Sorry " + name + ". You are not eligible for voting";
				m.addAttribute("message", msg);
				return "errorpage";
			}

		}

}
