package com.bhavna.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.bhavna.operation.EmployeePunch;

public class Main {
	public static void main(String args[]) throws Exception {
		EmployeePunch emp = new EmployeePunch();
		File file = new File("C:\\Users\\arpit.verma\\eclipse-workspace\\Validation\\src\\a.txt");

		// Creating an object of BufferedReader class
		BufferedReader br = new BufferedReader(new FileReader(file));
		// Declaring a string variable
		String st;
		while ((st = br.readLine()) != null) {
			emp.check(st);
		}
		emp.display();
		
	}
}
