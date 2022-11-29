package com.bhavna.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.bhavna.bean.Employee;


public class Operation {
public void nameS(List<Employee> l) {
	List<Employee> result = (List<Employee>) l.stream().filter(s -> ((Employee) s).getName().startsWith("S")).collect(Collectors.toList());
	System.out.println(result);
}
public void greaterSal(List<Employee> l) {
	List <Employee> result= l.stream().filter(s->s.getSalary()>100000).collect(Collectors.toList());
	System.out.println(result);
}
public void hyderabad(List<Employee> l) {
	List <Employee> result= l.parallelStream().filter(s->s.getLocation().equalsIgnoreCase("Hyderabad")).collect(Collectors.toList());
	System.out.println(result);
	
}
public void finder(List<Employee> l) {
	 Map<String,List<Employee>> map = (Map<String, List<Employee>>) l.stream().collect(Collectors.groupingBy(Employee::getLocation));
     System.out.println("Based on Location: "+map);
	
}
public List sort(List<Employee> l) {
	return Collections.sort(l, (p1, p2) -> ((Employee) p1).getName().compareTo(((Employee) p2).getName()));
}
}
