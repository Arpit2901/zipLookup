package com.bhavna.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Set;

import com.bhavna.bean.Employee;
import com.bhavna.operations.Operation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Employee> list=new ArrayList<Employee>();
		Employee emp=new Employee("Manan",40000 , "Ghaziabad");
		Employee emp2=new Employee("Sharan",50000 , "Goa");
		Employee emp3=new Employee("Raman",120000 , "pune");
		Employee emp6=new Employee("Nimit",52000 , "Hyderabad");
		Employee emp4=new Employee("Nitin",70000 , "Delhi");
		Employee emp5=new Employee("Mudit",42000 , "Hyderabad");
		Map <String,Employee> map1=new HashMap<String,Employee>();
		
		
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
//		Map map1=list.stream().map(p->p.getName()).collect(Collectors.toMap(Employee::getName,Employee));
		Operation obj =new Operation();
//		name starts with 'S'
		obj.nameS(list);
		//salary greater than 100000
		obj.greaterSal(list);
		list.stream().filter(p->p.getSalary()>50000).forEach(System.out::println);
//		parallelStream list of employee in hyderabad
		obj.hyderabad(list);
		//Location and employees
		obj.finder(list);
		//sort by name and Location
		obj.sort(list);
	}

}
