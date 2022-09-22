package com.Bhavna.doe;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int marks;

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks > o.marks)
			return -1;
		else if (this.marks < o.marks)
			return 1;
		else
			return 0;
	}
}
