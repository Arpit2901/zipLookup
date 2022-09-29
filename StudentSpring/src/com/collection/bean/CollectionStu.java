package com.collection.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;



public class CollectionStu {
	private int rollno;
	private String name;
	private double salary;
	private List<String> names;
	private Map<String,String> NamesRecord;
	private Set <Double> Salaries;
	private CollectionExam exam;
	
	public CollectionExam getExam() {
		return exam;
	}

	public void setExam(CollectionExam exam) {
		this.exam = exam;
	}

	public CollectionStu() {
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

	

	@Override
	public String toString() {
		return "CollectionStu [rollno=" + rollno + ", name=" + name + ", salary=" + salary + ", names=" + names
				+ ", NamesRecord=" + NamesRecord + ", Salaries=" + Salaries + ", exam=" + exam + "]";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Map<String, String> getNamesRecord() {
		return NamesRecord;
	}

	public void setNamesRecord(Map<String, String> namesRecord) {
		NamesRecord = namesRecord;
	}

	public Set<Double> getSalaries() {
		return Salaries;
	}

	public void setSalaries(Set<Double> salaries) {
		Salaries = salaries;
	}



}
