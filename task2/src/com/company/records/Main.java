package com.company.records;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("All Companies");
		System.out.println("cid \t name \t city \t turnover \t employees ");
		Records rec[]=new Records[4];
		rec[0]=new Records(001,"Bhavna","Noida",100000,400);
		rec[1]=new Records(42,"sopra","Patna",500000,50);
		rec[2]=new Records(51,"TCS","Pune",3000,3000);
		rec[3]=new Records(69,"TCS","Patna",5500,9000);
		for(Records rec1:rec) {
			rec1.display();
		}
		System.out.println("company where no of Employees greater than 100");
		System.out.println("cid \t name \t city \t turnover \t employees ");
		for(Records rec1:rec) {
			rec1.displayGreaterThan100();
		}
		System.out.println("enter the city to find companies there ");
		String city=sc.next();
		for(Records rec1:rec) {
			rec1.display(city);
		}
		System.out.println("companies where turnover isbetween 1000 && 10000 ");
		for(Records rec1:rec) {
			rec1.displayTurnOver();
		}
	}

}
