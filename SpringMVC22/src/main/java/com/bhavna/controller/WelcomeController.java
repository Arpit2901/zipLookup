package com.bhavna.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhavna.bean.ReferralBean;
import com.bhavna.dao.ReferralDao;

@Controller
public class WelcomeController {
	private int id=101;
	    @RequestMapping("/view.html")
	    public String displayy( Model m, ReferralDao dao) {
	    	List<ReferralBean> list = dao.add();
		m.addAttribute("list", list);
		System.out.println("in");
		
	        return "welcome";
	    }
	@RequestMapping("/home.html")
	public String display(HttpServletRequest req, Model m) {

		String name = req.getParameter("name");
		int pass = Integer.parseInt(req.getParameter("age"));
		System.out.println(pass+"in method"+name);
		if (pass > 18) {
			ReferralBean obj =new ReferralBean(id,name ,pass);
			ReferralDao opt=new ReferralDao();
			ReferralBean list1=new ReferralBean(id,name,pass);
			id++;
			String msg = "Hello " + name + " you are eligible for Referral";

			m.addAttribute("message", msg);
			m.addAttribute("list", list1);
			return "success";
			
		} else {
			String msg = name + " IS NOT QUALIFIED AS REFERRAL";
			m.addAttribute("message", msg);
			return "errorpage";
		}

	}
}
