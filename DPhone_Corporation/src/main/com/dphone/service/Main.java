package main.com.dphone.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
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
				Registration obj = new Registration(name, email, phone);
				RefferalCode code = new RefferalCode();
				code.displayBonus();
				choices();

			} else if (choice == 2) {
				Login user;
				user = new Login();
				System.out.println("Enter your phoneNumber");
				String userid = sc.next();
				user = new Login(userid);

				System.out.println("hii enter the code shared onyour number-" + user.getUsername() + "\n");
				String otp = sc.next();
				RefferalCode code = new RefferalCode();
				System.out.println("++++++++Successfully Logged in+++++++++/n your Bonus points are" + code.getBonus());
				choices();
			} else
				throw new InvalidChoiceException("Invalid Choice ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void choices() throws IOException {
		List<ReferTo> obj=null;
		Scanner sc = new Scanner(System.in);
		RefferalCode code = new RefferalCode();
		do {
		System.out.println("1- Do you want to buy a phone \n2-do you want to refer to someone\n3-Edit Referrals");
		int choicee = sc.nextInt();
		if (choicee == 1)
			code.purchase();
		else if(choicee==2){
			System.out.println("Enter the number of referrals");
			int n = sc.nextInt();
			ReferTo[] person = new ReferTo[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the name,phone,email of the referal contact=" + i + 1);
				String name = sc.next();
				String phone = sc.next();
				String email = sc.next();
				person[i] = new ReferTo(name, phone, email);
			}
			obj = new ArrayList<ReferTo>();
			for (int i = 0; i < person.length; i++) {
				obj.add(person[i]);
			}
			code.addReferral(obj);
			code.displayReferrals();
		}else{
			code.editReferrals(obj);
		}
		}while(true);

	}

}
