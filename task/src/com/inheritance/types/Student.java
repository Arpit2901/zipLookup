package com.inheritance.types;

public class Student extends Person{
	private int Rollno;
	private int Class;
	private double Percent;
	public Student(int rollno, int class1, double percent ,String name, int age,String address) {
		super(age, name, address);
		Rollno = rollno;
		Class = class1;
		Percent = percent;
	}
	public void display() {
		System.out.println("student class \n rollno="+Rollno+" class="+Class+" Percentage="+Percent);
	}

}
