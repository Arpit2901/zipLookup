package com.inheritance.types;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter eid");
		int eid=sc.nextInt();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		System.out.println("enter comapany ,age ,name ,address");
		String company=sc.next();
		int age=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		Person obj=new Employee(eid,salary,company,name ,age ,address);
		obj.display();
		System.out.println("enter roll class and percent");
		int rollno=sc.nextInt();
		int Class=sc.nextInt();
		double percent=sc.nextDouble();
		Person obj2=new Student(rollno ,Class,percent,name ,age ,address);
		obj2.display();
		
	}

}
