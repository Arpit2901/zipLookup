package com.bhavna.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhavna.bean.EmployeeRecord;
import com.bhavna.dao.EmployeeDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Controller
public class MainController {
	XmlMapper xmlMapper = new XmlMapper();

	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping("/welcome")
	public String home() {
		return "index2";
	}

	@RequestMapping(value = "/getActiveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute EmployeeRecord employee) {
		employeeDao.save(employee);
		return "redirect:/viewemp";//in xml format
	}
//	produces=MediaType.APPLICATION_XML_VALUE
	@RequestMapping("/viewemp")
	public String viewEmp(Model model) throws IOException {

		List<EmployeeRecord> list = employeeDao.getEmployee();
		model.addAttribute("list", list);
		System.out.println("In Model");
		try {
			String xml = xmlMapper.writeValueAsString(list);
			System.out.println(xml);
			xmlMapper.writeValue(new File("C:\\Users\\arpit.verma\\eclipse-workspace\\bhavnaMvc5\\src\\main\\webapp\\WEB-INF\\views\\viewemp.jsp"), list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "viewemp";

	}

	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m) throws IOException {
		Object list =   employeeDao.getEmpById(id);
		System.out.println(list);
		try {
			String xml = xmlMapper.writeValueAsString(list);
			System.out.println(xml);
			xmlMapper.writeValue(new File("C:\\Users\\arpit.verma\\eclipse-workspace\\bhavnaMvc5\\src\\main\\webapp\\WEB-INF\\views\\editE.jsp"), list);  
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "editE";
		

	}

}