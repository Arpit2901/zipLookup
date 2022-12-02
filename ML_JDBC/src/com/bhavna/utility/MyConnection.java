package com.bhavna.utility;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
	public static Connection getConnection() {
		Connection connect=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded and Register");
		
			String connectionString="jdbc:mysql://localhost:3306/emp_db";
			connect=DriverManager.getConnection(connectionString,"root","Bhavna@123");
			System.out.println("Connected");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connect;
	}
}
