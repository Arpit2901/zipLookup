package com.jdbc.dao;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.service.MyConnection;

public class Operations {
	private static String refferalCode="qwerty";
	private long bonus=0;

	public int addReferral(int id,String name,String mobile,String email) {
		int i=0;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();			
			PreparedStatement stmt = connection.prepareStatement("insert into Referral values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, mobile);
			stmt.setString(4, email);
			 i =stmt.executeUpdate();
			System.out.println("record has been added");

		} catch (Exception ex) {
			System.out.println("IOException is caught " + ex);
		}
		return i;
	}

	public void displayReferrals() {
		Connection connection = null;
		connection = MyConnection.getConnection();	
		Statement stmt;
		try {
			stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Referral");
        System.out.println("id " +"\t" + "name\t" + " " + "mobile"+"\t"+ "email " );
        System.out.println();
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " "
                    + rs.getString(4) +"\n");
        System.out.println();
        connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteReferrals(int id) {
		int i;
		Connection connection = null;
		connection = MyConnection.getConnection();			
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement("delete from Referral where referalId=(?)");
		stmt.setInt(1, id);
		 i =stmt.executeUpdate();
		System.out.println("record has been deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void editReferrals() throws IOException {
	displayReferrals();
	int i=0;
	Connection connection = null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id of the referral you want to edit");
	int id=sc.nextInt(); 
	System.out.println("Enter the updated mobile number");
	String num=sc.next(); 
	connection = MyConnection.getConnection();			
	PreparedStatement stmt;
	try {
		stmt = connection.prepareStatement("update Referral set mobile='97987099' where referalId=(?)");
	
	stmt.setInt(1, id);

	 i =stmt.executeUpdate();
	System.out.println("record has been updated");
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

	public void purchase() {
		try  {
			Scanner sc = new Scanner(System.in);
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
