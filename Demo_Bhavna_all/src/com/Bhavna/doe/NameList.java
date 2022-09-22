package com.Bhavna.doe;

import java.util.ArrayList;
import java.util.List;

public class NameList {
	  public static void main(String[] args) {
		  //List 
		  List <String>listname=new ArrayList<String>();
		  listname.add("Arpit");
		  listname.add("Shobhit");
		  listname.add("Vinit");
		  listname.add("Rohit");
		  listname.add("Mohit");
		  MyStreamOperation op=new MyStreamOperation();
		  op.operations(listname);
		  //Student object
		  Student stud1=new Student(101,"Arpit",95);
		  Student stud2=new Student(102,"Mohit",30);
		  Student stud3=new Student(103,"pulkit",40);
		  Student stud4=new Student(104,"Sohit",80);
		  Student stud5=new Student(105,"Rohit",65);
		  List <Student> listStud= new ArrayList<Student>();
		  listStud.add(stud1);
		  listStud.add(stud2);
		  listStud.add(stud3);
		  listStud.add(stud4);
		  listStud.add(stud5);
		  op.sort(listStud);
		  EmployeeRecords rec=new EmployeeRecords();
		  //List of employee	
		  Employee emp1=new Employee(101,"Arpit",850);
		  Employee emp2=new Employee(102,"Mohit",300);
		  Employee emp3=new Employee(103,"pulkitm",75000);
		  Employee emp4=new Employee(101,"Shobhit",950);
		  Employee emp5=new Employee(105,"Rohitm",650);
		  List <Employee> employe= new ArrayList<Employee>();
		  employe.add(emp1);
		  employe.add(emp2);
		  employe.add(emp3);
		  employe.add(emp4);
		  employe.add(emp5);
		  System.out.println("list of employee name ends with `m`");
		  rec.operations2(employe);
		  System.out.println("Descending order rof salaary");
		  rec.descendingSalary(employe);
		  System.out.println("Sorted order of name");
		  rec.sortName(employe);
		  System.out.println("Employees total salary");
		  rec.totalSalary(employe);
		  System.out.println("Max and min salary paid");
		  rec.maxNmin(employe);
		  System.out.println("number of employee having salary more than 70 k");
		  rec.SalMoreThan70(employe);
	  }
}
