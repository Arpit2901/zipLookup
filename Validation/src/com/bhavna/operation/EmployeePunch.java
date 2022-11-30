package com.bhavna.operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.bhavna.bean.EmployeeEntry;
import com.bhavna.exceptionHandling.InvalidNameException;

public class EmployeePunch {
	List<EmployeeEntry> list = new ArrayList<EmployeeEntry>();
//	Map<String, EmployeeEntry> Success = new HashMap<String, EmployeeEntry>();
	Map<String, EmployeeEntry> failure = new HashMap<String, EmployeeEntry>();

	public void punchIn(String st, boolean flag) throws InvalidNameException {
		try {
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
//					add(s1, s2, flag);
					check(s1, s2, flag);
					break;
				}
			}
		} catch (Exception e) {
			addToSuccess(null, null, false);
			System.out.println(e);
		}
	}

	public void check(String name, String dateTime, boolean flag) {
		EmployeeEntry emp = new EmployeeEntry(name, dateTime);
		Pattern pattern = Pattern.compile("^\\d{2}.\\d{2}\\s\\d.[0-9]\\d{2}AM|PM$");
		Matcher matcher = pattern.matcher(dateTime);
		boolean found = matcher.find();
		if(found)
		addToSuccess(name, dateTime, flag);
		else
			failure.put(name, emp);

	}

	public void addToSuccess(String name, String dateTime, boolean flag) {
		EmployeeEntry emp1 = new EmployeeEntry(name, dateTime);
		if (flag == false)
			addToMap(list);
	
		list.add(emp1);
		System.out.println(flag);
	}

	public void addToMap(List<EmployeeEntry> l) {
		Map<String, List<EmployeeEntry>> m = (Map<String, List<EmployeeEntry>>) l.stream()
				.collect(Collectors.groupingBy(EmployeeEntry::getName));
		System.out.println("Success Map");
		System.out.println("Success Data" + m);
		System.out.println("Failure Map");
		System.out.println("Failure Data" + failure);
		
	}
}

//		 for (int i = 0; i < dateTime.length(); ++i) {
//	            char ch = dateTime.charAt(i);
//	           // If the character is not a letter and not a whitespace, return false.
//	            if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
//	                System.out.println("in if"+ch);
//	            }
//	            else
//	            System.out.println("inelse"+ch);