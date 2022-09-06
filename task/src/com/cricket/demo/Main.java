package com.cricket.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("press 1 -for the details of batsman and bowler"
				+ "2 - for runs ");
		int choice=sc.nextInt();
		int run[]= {1,2,3,4,6};
		int n= (int) (Math.random()*(4)) + 1;
		String batsman[]= {"Dhoni","Kohli","Pandya","Tendulkar","Dhawan"};
		String baller[]= {"khan","kishan","Pandya","bumrah","yadav"};
		Delivery obj=new Delivery();
		if(choice==1) {
			obj.displayDeliveryDetails(baller[n], batsman[n]);
		}else if(choice==2) {
			obj.displayDeliveryDetails(run[n]);
		}else {
			System.out.println("wrong choice");
		}
		
		
	}

}
