package com.casestudy.dao;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.util.List;
	import java.util.NoSuchElementException;
	import java.util.Scanner;

import com.casestudy.bean.ReferralTo;

	public class RefferalCode {
		private static String refferalCode="qwerty";
		private long bonus=0;
		private static String fileName = "D://av/referals.txt";

		public RefferalCode() {

		}

		public void addReferral(List person) {
			try {
				// Saving of object in a file
				FileOutputStream file = new FileOutputStream(fileName, true);
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(person);
				out.close();
				file.close();
				System.out.println("record has been added");

			} catch (IOException ex) {
				System.out.println("IOException is caught " + ex);
			}

		}

		public void displayReferrals() {
			ReferralTo person1 = null;
			try {
				FileInputStream file2 = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(file2);

				// deserialization of object
				System.out.println("Deserialized Data: \n" + in.readObject().toString());
				in.close();
				file2.close();
			}
			catch (Exception ex) {
				System.out.println("Exception caught" + ex);
			}

		}
		public void editReferrals(List<ReferralTo> obj) throws IOException {
			displayReferrals();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the contact you want to edit");
			String contactPerson=sc.next();
//		    for(int i=0;i<obj.size();i++) {
//	            if(obj.get(i).name.equalsIgnoreCase(contactPerson)) {
//	              
			for(ReferralTo person:obj) {
				if(person.getName().equalsIgnoreCase(contactPerson)) {
					System.out.println("found record");
					 try {
			             /*FileInputStream  Fs = new FileInputStream("Myfile");
			             ObjectInputStream Os = new ObjectInputStream(Fs);
			             ArrayList<Myclass> object3 = (ArrayList<Myclass>)Os.readObject();*/
			
//			             obj.remove(new ReferralTo(obj.get(i).name,obj.get(i).mobile,obj.get(i).email));
			             obj.remove(new ReferralTo(person.getName(),person.getMobile(),person.getEmail()));
			             FileOutputStream fs = new FileOutputStream(fileName);
			             ObjectOutputStream os = new ObjectOutputStream(fs);
//			             System.out.println("Deserialized Data: \n" + os.readObject().toString());
			             os.writeObject(obj);
			             os.flush();
			             os.close();
			
			         } catch (FileNotFoundException e) {
			             e.printStackTrace();
			         }
					 System.out.println("deleted record");
//					 displayReferrals();
				}
					
			}
		}

		public void purchase() {
			try (Scanner sc = new Scanner(System.in)) {
				String choice;
				System.out.println("Do you have a refferal code $$$$$\nyes---y");
				choice = sc.next();
				if (choice.equalsIgnoreCase("y")) {
					System.out.println("Enter the refferal code : ");
					String Code = sc.next();
					if(refferalCode.equalsIgnoreCase(Code)) {
					System.out.println("Hurray !!!! You are eligible for an exciting offer\n");
					System.out.println("Do you want to avail the offer and buy a phone\n%%%%y---yes%%%%");
					String like = sc.next();
					if (like.equalsIgnoreCase("y")) {
						System.out.println("------Thank you -------\nYou have successfully availed the bonus and eligible for referral ");
						bonus = bonus + 1000;
						this.setBonus(bonus);
						System.out.println("Your bonus points are "+this.getBonus());
					} else {
						System.out.println("You are missing on a big deal. Go grab it ");
					}
					}else {
						System.out.println("Sorry the referral did'nt worked \nThank you...");
					}
					}else {
						System.out.println("\t\tThank you ....");
						
					}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void displayBonus() {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("to access your dashboard please provide your name and otp--");
				System.out.println("Enter your username : ");
				String userName;
				userName = sc.next();
				System.out.println("Enter your otp : ");
				int otp=sc.nextInt();
				System.out.println("******Welcome to the dashboard*******");
				System.out.println("Hey " + userName + "\tYour Bonus is " + this.getBonus());
			
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public long getBonus() {
			return bonus;
		}

		public void setBonus(long bonus) {
			this.bonus = bonus;
		}

	}

