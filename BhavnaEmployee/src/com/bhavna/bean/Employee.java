package com.bhavna.bean;

public class Employee {
	private String name;
	private long salary;
	private String Location;
	public Employee(String name, long salary, String location) {
		super();
		this.name = name;
		this.salary = salary;
		Location = location;
	}
	
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + ", Location=" + Location + "]\n";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}	
}
