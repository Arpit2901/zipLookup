package com.inheritance.types;

public class Employee extends Person{
	private int Eid;
	private int Salary;
	private String Company;
	public Employee(int eid, int salary, String company,String name, int age,String address) {
		super(age, name, address);
		Eid = eid;
		Salary = salary;
		Company = company;
	}
	public void display() {
		System.out.println("Employee class \n salary"+Salary+" Eid="+Eid+" company="+Company);
	}
}
