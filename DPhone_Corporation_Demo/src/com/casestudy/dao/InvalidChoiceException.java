package com.casestudy.dao;

public class InvalidChoiceException extends Exception {
	public InvalidChoiceException(String str) {
		System.out.println("Invalid choice");
	}
}
