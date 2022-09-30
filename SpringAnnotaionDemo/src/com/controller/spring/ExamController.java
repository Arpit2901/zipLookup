package com.controller.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.component.Spring.annotation.Exam;
import com.dao.Exam.ExamServices;

@Component("controllerObject")
public class ExamController {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/resources/spring/configuration.xml");
		Exam obj=(Exam) ac.getBean("examObject");
		System.out.print(obj);
		System.out.println(obj.getName());
	}
	
	@Autowired
	private ExamServices service;
	public void addExam() {
		service.addExam();
	}

}
