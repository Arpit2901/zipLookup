package com.constructorInjection.bean;


public class StudenNew {
	private int rollno;
	private String name;
	private double salary;
	private ExamNew exam;
	
	
	public StudenNew() {
		super();
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public ExamNew getExam() {
		return exam;
	}

	public void setExam(ExamNew exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "StudenNew [rollno=" + rollno + ", name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}
	
	

}
