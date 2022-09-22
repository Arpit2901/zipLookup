package com.Bhavna.doe;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeRecords {
	public void operations2(List<Employee> emp) {
		emp.stream().filter(employee -> employee.getName().endsWith("m")).forEach(System.out::println);
	}

	public void sortName(List<Employee> emp) {
		List sortName = emp.stream().sorted((p1, p2) -> ((String) p1.getName()).compareToIgnoreCase(p2.getName()))
				.collect(Collectors.toList());
		System.out.println(sortName);
	}

	public void descendingSalary(List<Employee> emp) {
		emp.stream().sorted().forEach(System.out::println);
	}

	public void totalSalary(List<Employee> emp) {
		double salary = 0;
		for (Employee st : emp) {
			salary += st.getSalary();
		}
		System.out.println(salary);
	}

	public void maxNmin(List<Employee> emp) {
		Employee maxSalary = emp.stream().max(Comparator.comparing(Employee::getSalary)).get();

		Employee minSalary = emp.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Maxsalary " + maxSalary + "\nMinSalary " + minSalary);
	}
	public void SalMoreThan70(List<Employee> emp) {
		long count=emp.stream().filter(man ->man.getSalary()>70000).collect(Collectors.counting());
		System.out.println(count);
	}

}
