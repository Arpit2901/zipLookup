package com.Bhavna.doe;

import java.util.List;
import java.util.stream.Collectors;

public class MyStreamOperation {
	public void operations(List list) {
		List limit = (List) list.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);

	}

	public void sort(List<Student> stud) {
		List sortedList=stud.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		stud.stream().filter(stu -> stu.getName().startsWith("A")).map(pm -> pm.getMarks())
				.forEach(System.out::println);
		// filtering price
          
	}
	
}
