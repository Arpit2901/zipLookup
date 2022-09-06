package com.card.details;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the choice as 1-payback card"
     		+ "2-membership card");
     int choice=sc.nextInt();
     System.out.println("Enter the holderName,cardNumber,expiryDate");
     String holderName=sc.next();
	 String cardNumber=sc.next();
	 String expiryDate=sc.next();
     if(choice==1) {
    	 Card obj=new Payback(holderName, cardNumber, expiryDate, 50, 5000.0);
    	obj.display();
     }
     if(choice==2) {
    	 Card obj2=new MembershipCard(holderName, cardNumber, expiryDate, 4);
    	 obj2.display();
     }
	}
}
