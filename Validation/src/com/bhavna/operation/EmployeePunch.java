package com.bhavna.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bhavna.bean.EmployeeEntry;
import com.bhavna.exceptionHandling.InvalidNameException;

public class EmployeePunch {
	List<EmployeeEntry> list = new ArrayList<EmployeeEntry>();
	Map<String, ArrayList<EmployeeEntry>> Success = new HashMap<String, ArrayList<EmployeeEntry>>();
	Map<String, ArrayList<EmployeeEntry>> failure = new HashMap<String, ArrayList<EmployeeEntry>>();

	public void check(String st) throws InvalidNameException {
		try {
			st = st.trim();
			if (st == null)
				throw new InvalidNameException("");
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
					addToMap(s1, s2);
					break;
				}
			}
		} catch (Exception e) {	
			System.out.println(e);
		}
	}

	public void addToMap(String name, String dateTime) throws InvalidNameException {
		EmployeeEntry emp = new EmployeeEntry(name, dateTime);
		Pattern pattern = Pattern.compile("^\\d{2}.\\d{2}\\s\\d.[0-9]\\d{2}AM|PM$");
		Matcher matcher = pattern.matcher(dateTime);
		boolean found = matcher.find();
		//
		if (Success.containsKey(name)) {
			if (Success.containsKey(name) || found) {
				((List<EmployeeEntry>) Success.get(name)).add(emp);
			} else {
				failure.put(name, new ArrayList<EmployeeEntry>());
				failure.get(name).add(emp);
				throw new InvalidNameException(" inCorrect entry"+name);
			}
		} else {
			if (found) {
				Success.put(name, new ArrayList<EmployeeEntry>());
				Success.get(name).add(emp);
			} else {
				failure.put(name, new ArrayList<EmployeeEntry>());
				failure.get(name).add(emp);
				throw new InvalidNameException(" inCorrect entry "+name);
			}
		}
	}

	public void display() {
		System.out.println("Success Map");
		System.out.println("Success Data" + Success);
		System.out.println("Failure Map");
		System.out.println("Failure Data" + failure);

	}
}