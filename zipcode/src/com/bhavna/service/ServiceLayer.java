package com.bhavna.service;

import java.util.Scanner;

import com.bhavna.model.ZipServicev1;
import com.bhavna.model.ZipServicev2;

public class ServiceLayer {
	int choice = 1;
	long code = 0;
	ZipServicev1 obj = new ZipServicev2();
	Scanner sc = new Scanner(System.in);

	public ServiceLayer() {
		super();
	}
	public void operation() {
		System.out.println("######Zip Lookup Service******");
		do {
			System.out.println("\nEnter !!!!\n1-getting area \n2-setting a new zipcode \n3-print all the zip code");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the zip code nummeric value only");
				code = sc.nextLong();
				obj.search(code);
			} else if (choice == 2) {
				System.out.println("Enter the country,state,area,code");
				String country = sc.next();
				String state = sc.next();
				String area = sc.next();
				code = sc.nextLong();
				obj.addRecord(country, state, area, code);
			} else if (choice == 3) {
				System.out.println("*****All the records******");
				obj.allRecord();
			} else
				System.out.println("Wrong choice");

			System.out.println("Do you want to exit press 0 else any key");
			choice = sc.nextInt();
		} while (choice != 0);
	}

}
