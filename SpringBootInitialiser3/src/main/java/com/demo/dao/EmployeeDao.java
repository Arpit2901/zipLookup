package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Employee;

public class EmployeeDao {

	  static List<Employee> empLst=new ArrayList<Employee>();
	    
	    public static List<Employee> getAllEmployee(){
	        Employee emp1=new Employee(1,"Ajay",60);
	        Employee emp2=new Employee(2,"Axat",70);
	        Employee emp3=new Employee(3,"Ravi",80);
	        Employee emp4=new Employee(4,"Rakesh",90);
	        empLst.add(emp1);
	        empLst.add(emp2);
	        empLst.add(emp3);
	        empLst.add(emp4);
	        
	        return empLst;
	    }
	    
	    public static Employee generateEmployeeById(int id) {
	        Employee emp=new Employee(id,"Rakesh",50);
	        return emp;
	    }
	    public static Employee addEmployee(Employee e) {
	        empLst.add(e);
	        System.out.println("Employee added");
	        return e;
	    }



	}


