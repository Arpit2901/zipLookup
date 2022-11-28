package com.bhavna.operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bhavna.bean.EmployeeEntry;

public class EmployeePunch {
	List<EmployeeEntry> lst = new ArrayList<EmployeeEntry>();
	HashMap<String, EmployeeEntry> hm = new HashMap<String, EmployeeEntry>();

	public void check(String name, String dateTime) {
		Scanner sc = new Scanner(System.in);
		if (name == null) {
			name = sc.next();
		} else if (dateTime == null) {
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM HH:mm");
			dateTime = myDateObj.format(myFormatObj);
		}
		add(name, dateTime);
	}

	public void add(String name, String dateTime) {
		EmployeeEntry emp1 = new EmployeeEntry(name, dateTime);
		try {
			hm.put(name, emp1);
		} catch (Exception e) {
			System.out.println("Failure" + e);
		}
		lst.add(emp1);

		for (Map.Entry<String, EmployeeEntry> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

	public void punchIn(String st) {
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
				check(s1, s2);
				break;
			}
		}
	}
}
