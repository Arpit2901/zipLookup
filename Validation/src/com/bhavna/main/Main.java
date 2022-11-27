package com.bhavna.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.bhavna.operation.EmployeePunch;

public class Main {
	public static void main(String args[]) throws Exception {
		Main obj = new Main();
		File file = new File("C:\\Users\\arpit.verma\\eclipse-workspace\\Validation\\src\\a.txt");

		// Creating an object of BufferedReader class
		BufferedReader br = new BufferedReader(new FileReader(file));

		// Declaring a string variable
		String st;
		while ((st = br.readLine()) != null) {
			obj.add(st);
		}
	}

	public void add(String st) {
		EmployeePunch emp = new EmployeePunch();
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch != ' ')
				s1 = s1 + ch;

			if (ch == ' ' || i == st.length() - 1) {
				for (int j = i; j < st.length(); j++) {
					char chr = st.charAt(j);
					s2 = s2 + chr;
				}
				emp.add(s1, s2);
				break;
			}
		}
	}
}
