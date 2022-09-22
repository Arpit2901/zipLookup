package com.Bhavna.doe;
import java.util.*;  

public class NameComparator implements Comparator<Employee>{ 

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee s1=(Employee)o1;  
		Employee s2=(Employee)o2;  
		  
		return s1.getName().compareToIgnoreCase(s2.getName()); 
	}  
	 
}
