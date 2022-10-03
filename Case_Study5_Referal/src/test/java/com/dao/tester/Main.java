package com.dao.tester;

import java.io.IOException;
import java.util.Scanner;

import com.dao.service.InvalidChoiceException;
import com.jdbc.dao.Operations;
import com.jdbc.service.Login;
import com.jdbc.service.MyConnection;
import com.jdbc.service.Registration;

public class Main {
	public static void main(String args[]) throws IOException, InvalidChoiceException {
		
	MyConnection obj=new MyConnection();
	MyConnection.getConnection();
	Operations query=new Operations();
	Scanner sc = new Scanner(System.in);

	int choice;
	System.out.println("--------Welcome to DPhone corporation------\n");
	System.out.println("Enter   1-Registration \n\t2-Login");
	choice = sc.nextInt();
	if (choice == 1) {
		System.out.println("Please Register Yourself First\nEnter your name");
		String name = sc.next();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your phoneNumber");
		long phone = sc.nextLong();
		Registration user = new Registration(name, email, phone);
//		RefferalCode code = new RefferalCode();
//		code.displayBonus();
		choices();

	} else if (choice == 2) {
		Login user;
		user = new Login();
		System.out.println("Enter your phoneNumber");
		String userid = sc.next();
		user = new Login(userid);

		System.out.println("hii enter the code shared onyour number-" + user.getUsername() + "\n");
		String otp = sc.next();
		System.out.println("++++++++Successfully Logged in+++++++++/n your Bonus points are" +0);
		choices();
	} else
		throw new InvalidChoiceException("Invalid Choice "); 

	System.out.println("connection");
	}
	

public static void choices() throws IOException {

Scanner sc = new Scanner(System.in);
Operations code = new Operations();
Operations query=new Operations();
do {
System.out.println("1- Do you want to buy a phone \n2-do you want to refer to someone \n3-Display Referrals \n4-edit referral\n5-Delete Referrals");
int choicee = sc.nextInt();
if (choicee == 1)
	code.purchase();
else if(choicee==2){
//	int i=query.addReferral(103, "sham", "99155717", "sham@gmail.com");
	int i=query.addReferral(104, "tam", "988155717", "tam@gmail.com");

	
	}
else if(choicee==3){
	query.displayReferrals();

	
}
else if(choicee==4){
	query.editReferrals();

	
}
else if(choicee==5){
	query.deleteReferrals(103);
}
	
else{

}
}while(true);

}

}