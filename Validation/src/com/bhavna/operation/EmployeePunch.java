package com.bhavna.operation;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bhavna.bean.EmployeeEntry;

public class EmployeePunch {
	private int empId;
	List<EmployeeEntry> lst = new ArrayList<EmployeeEntry>();
	HashMap<String, EmployeeEntry> hm = new HashMap<String, EmployeeEntry>();

	public void add(String name, String dateTime) {
		EmployeeEntry emp1 = new EmployeeEntry(name, dateTime);
		lst.add(emp1);
		try {
		hm.put(name, emp1);
		}catch(Exception e) {
			System.out.println("Failure"+e);
		}

		for (Map.Entry<String, EmployeeEntry> e : hm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}

	public void punchIn() {

	}
}
