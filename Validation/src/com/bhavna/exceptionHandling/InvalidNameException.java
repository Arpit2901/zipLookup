package com.bhavna.exceptionHandling;

public class InvalidNameException extends Exception {
	public InvalidNameException(String s) {
		System.out.println("Failure"+s);
	}
}
