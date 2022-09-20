package main.com.dphone.service;

public class InvalidChoiceException extends Exception {
	public InvalidChoiceException(String str) {
		System.out.println("Invalid choice");
	}
}
