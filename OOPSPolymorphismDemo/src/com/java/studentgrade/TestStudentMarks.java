package com.java.studentgrade;

class TestStudentMarks {
	public static void main(String arg[]) {
		Student madhavan = new Student("Madhavan");

		madhavan.subject1 = 87;
		madhavan.subject2 = 65;
		madhavan.subject3 = 93;

		madhavan.total_marks = 235;

		System.out.println("Subject 1 = " + madhavan.subject1);
		System.out.println("Subject 2 = " + madhavan.subject2);
		System.out.println("Subject 3 = " + madhavan.subject3);
		System.out.println("Total = " + madhavan.total_marks);
	}
}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}

	int subject1;
	int subject2;
	int subject3;
	int total_marks;
}