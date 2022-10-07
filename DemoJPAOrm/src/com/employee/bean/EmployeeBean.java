package com.employee.bean;

public class EmployeeBean {
private int eid;
private String name;
private int salary;


public EmployeeBean() {
	super();
}
public EmployeeBean(int eid, String name, int salary) {
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeBean [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
}

}
