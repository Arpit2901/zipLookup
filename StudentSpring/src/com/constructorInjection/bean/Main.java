package com.constructorInjection.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Exam;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/student/resources/Spring_student_exam_configuration.xml");
		StudenNew stud1 = (StudenNew) ac.getBean("stud1");
		System.out.println("Student data");
		System.out.println(stud1);
		System.out.println("Exam data");
;

	}

}
