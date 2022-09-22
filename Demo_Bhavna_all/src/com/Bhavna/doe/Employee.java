package com.Bhavna.doe;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	private double salary;
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if (this.salary > o.salary)
			return -1;
		else if (this.salary < o.salary)
			return 1;
		else
			return 0;
		
	}
	@Override
	public String toString() {
		return "\nEmployee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}
