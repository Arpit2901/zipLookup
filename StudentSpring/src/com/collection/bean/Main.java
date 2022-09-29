package com.collection.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String arg[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/student/resources/StudentScope.xml");
		CollectionStu stud1 = (CollectionStu) ac.getBean("studCollection");
		System.out.println("Student data");
		System.out.println(stud1);
		System.out.println(stud1.getSalaries());
		System.out.println(stud1.getNames());
		System.out.println(stud1.getNamesRecord());
		

	}
}
