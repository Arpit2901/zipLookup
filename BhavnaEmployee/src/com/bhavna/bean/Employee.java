package com.bhavna.bean;

public class Employee {
	private String name;
	private long salary;
	private String location;
	public Employee(String name, long salary, String location) {
		super();
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return " [name=" + name + ", salary=" + salary + ", location=" + location + "]\n";
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
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}	
}
