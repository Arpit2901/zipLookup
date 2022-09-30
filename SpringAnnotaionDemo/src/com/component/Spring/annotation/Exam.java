package com.component.Spring.annotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("examObject")
public class Exam {

		@Value("1001")
	    private int eId;
	    @Value("English")
	    private String name;
	    @Value("98")
	    private int marks;
	    @Value("#{feedExamList.subject}")
	    private List<String> subject;
	    @Value("#{feedExamList.markRecord}")
	    private Map<String, Integer> markRecord;
//	    @Value("#{studentObject}")
//	    private Student student;

	    	public Exam(int eId, String name, int marks, List<String> subject, Map<String, Integer> markRecord) {
	    		super();
	    		this.eId = eId;
	    		this.name = name;
	    		this.marks = marks;
	    		this.subject = subject;
	    		this.markRecord = markRecord;
//	    		this.student = student;
	    	}



	   public Map<String, Integer> getMarkRecord() {
	        return markRecord;
	    }

	   public void setMarkRecord(Map<String, Integer> markRecord) {
	        this.markRecord = markRecord;
	    }

	   public Exam() {
	    }

	   public int geteId() {
	        return eId;
	    }

	   public void seteId(int eId) {
	        this.eId = eId;
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



	   public List<String> getSubject() {
	        return subject;
	    }



	   public void setSubject(List<String> subject) {
	        this.subject = subject;
	    }

	   @Override
	    public String toString() {
	        return "ExamWithCollection [eId=" + eId + ", name=" + name + ", marks=" + marks + ", subject=" + subject
	                + ", markRecord=" + markRecord + "]";
	    }



	}

