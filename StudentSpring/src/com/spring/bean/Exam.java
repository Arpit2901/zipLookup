package com.spring.bean;

public class Exam {
	private int Eid;
	private String name;
	private int marks;

	@Override
	public String toString() {
		return "Exam [Eid=" + Eid + ", name=" + name + ", marks=" + marks + "]";
	}

	public Exam() {
		super();
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
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
}
