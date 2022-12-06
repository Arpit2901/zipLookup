package com.bhavna.bean;

import java.sql.Date;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Double employeeSalry;
	private Date joiningDate;
	
	public Employee(int employeeId, String employeeName, Double employeeSalry, Date joiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalry = employeeSalry;
		this.joiningDate = joiningDate;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getEmployeeSalry() {
		return employeeSalry;
	}
	public void setEmployeeSalry(Double employeeSalry) {
		this.employeeSalry = employeeSalry;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalry="
				+ employeeSalry + ", joiningDate=" + joiningDate + "]";
	}



}
