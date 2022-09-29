package com.collection.bean;

public class CollectionExam {
	private int Eid;
	private String name;
	private int marks;

	@Override
	public String toString() {
		return "Exam [Eid=" + Eid + ", name=" + name + ", marks=" + marks + "]";
	}

	public CollectionExam(int eid, String name, int marks) {
		super();
		Eid = eid;
		this.name = name;
		this.marks = marks;
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
