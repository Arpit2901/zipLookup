package com.bhavna.operations;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import com.bhavna.bean.Employee;
//employyee declaration
public class Operation {
	public void nameS(List<Employee> l) {
		List<Employee> result =  l.stream().filter(s -> (s).getName().startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(result);
	}

	public void greaterSal(List<Employee> l) {
		List<Employee> result = l.stream().filter(s -> s.getSalary() > 100000).collect(Collectors.toList());
		System.out.println(result);
	}

	public void hyderabad(List<Employee> l) {
		List<Employee> result = l.parallelStream().filter(s -> s.getLocation().equalsIgnoreCase("Hyderabad"))
				.collect(Collectors.toList());
		System.out.println(result);

	}

	public void finder(List<Employee> l) {
		Map<String, List<Employee>> map = l.stream()
				.collect(Collectors.groupingBy(Employee::getLocation));
		System.out.println("Based on Location: " + map);

	}

	public void sort(List<Employee> l) {
		// sorting by Location
		Collections.sort(l, (p1, p2) -> (p1).getLocation().compareTo(((Employee) p2).getLocation()));

//	Sorting  by Name
		Collections.sort(l, (p1, p2) -> (p1).getName().compareTo(((Employee) p2).getName()));
		System.out.println(l);
	}
}
