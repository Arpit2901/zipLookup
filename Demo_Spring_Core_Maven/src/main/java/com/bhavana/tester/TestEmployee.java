package com.bhavana.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhavana.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bhavana/resources/my_bean_configuration.xml");
		Employee employee = (Employee)ac.getBean("employee");
		System.out.println(employee);
	}

}
