package com.bhavna.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.bhavna.bean.Department;
import com.bhavna.bean.Employee;
import com.bhavna.dao.Operations;

public class Service {
	Scanner sc = new Scanner(System.in);
	Operations obj = new Operations();

	public void inputEmp() throws ParseException {

		System.out.println("Enter the employeeid,name,salary");
		int id = sc.nextInt();
		String name = sc.next();
		Double salary = sc.nextDouble();
		String jDate = sc.next();
		java.util.Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(jDate);
		java.sql.Date date = new java.sql.Date(date1.getTime());
		Employee emp = new Employee(id, name, salary, date);
		obj.insertEmpData(emp);

	}

	public void inputDep() {

		System.out.println("Enter the departmentid,name,employeeID");
		int id = sc.nextInt();
		String name = sc.next();
		int empid = sc.nextInt();

		Department dep = new Department(id, name, empid);
		obj.insertDepData(dep);

	}
}
