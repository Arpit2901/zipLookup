package com.maven.Jdbcdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStQueries {
	public int addCompany() {
		int i=0;
		Connection connection = null;
		try {
		connection = MyConnection.getConnection();			
		PreparedStatement stmt = connection.prepareStatement("insert into User values(?,?,?,?,?)");
		stmt.setInt(1, 106);
		stmt.setString(2, "HP");
		stmt.setString(3, "Pune");
		stmt.setLong(4, 987000);
		stmt.setString(5, "2018-07-10");
		 i =stmt.executeUpdate();
		
		System.out.println("Inserted");
		}catch(Exception e) {
			System.out.println(e);
		}
	return i;
	}
	public int UpdateCompany() {
		Connection connection = null;
		int i=0;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("update User set name =?,turnover=? where comapnyId =?");
			stmt.setString(1, "Kent");
			stmt.setLong(2, 888366);
			stmt.setInt(3, 101);
			 i =stmt.executeUpdate();
			
			System.out.println("updated");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public int deleteData() {
		int i=0;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("delete from User where comapnyId =?");
			stmt.setInt(1, 102);
			 i =stmt.executeUpdate();			
			System.out.println("deleted");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
}
