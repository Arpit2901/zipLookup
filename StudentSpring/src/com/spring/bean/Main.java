package com.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/student/resources/Spring_student_exam_configuration.xml");
		Student stud = (Student) ac.getBean("stud");
		System.out.println("Student data");
		System.out.println(stud);
		System.out.println("Exam data");
		Exam exam =(Exam)ac.getBean("exam");
		System.out.println(exam);
	}


}
