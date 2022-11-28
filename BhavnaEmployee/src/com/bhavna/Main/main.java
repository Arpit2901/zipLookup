package com.bhavna.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bhavna.bean.Employee;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Employee> list=new ArrayList<Employee>();
		Employee emp=new Employee("Manan",40000 , "Ghaziabad");
		Employee emp2=new Employee("Sharan",50000 , "Goa");
		Employee emp3=new Employee("Raman",60000 , "pune");
		Employee emp4=new Employee("nitin",70000 , "Delhi");
		Employee emp5=new Employee("Mudit",42000 , "Ghaziabad");
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
	}

}
