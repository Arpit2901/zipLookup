package com.bhavna.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bhavna.utility.MyConnection;

public class Operations {
	public void fetchData() {
		
		Connection connection=MyConnection.getConnection();
		try {
		Statement statement = connection.createStatement();
		System.out.println("Connected");
		ResultSet resultSet = statement.
		        executeQuery("select * from employee e inner join department d on e.employeeId = d.employeeId;");
		while (resultSet.next()){
		    System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getDouble(3) + " "
		            + resultSet.getString(4)+" "+resultSet.getInt(5)+" "+resultSet.getString(6));
		}
		}catch(Exception e) {
			System.out.println("excep"+e);
		}
	}
	public void add() {
		
	}
}
