package com.dao.crud.jdbc;

import com.bean.crud.jdbc.CompanyDetails;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Queries {
	public int addCompany() {
		int i=0;
		Statement statement =null;
		Connection conne =null;
		CompanyDetails com=new CompanyDetails(102,"Hcl",999600,"lkn","2019-01-02");
		try {
			conne=MyConnection.getConnection();
			statement= conne.createStatement();
			String sql="insert into User value("+com.getCid()+",'"+com.getName()+"','"+com.getAddress()+"',"+com.getTurnover()+",'2019-11-02');";
			i= statement.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public int UpdateCompany() {
		int i=0;
		Statement statement =null;
		Connection conne =null;
		CompanyDetails com=new CompanyDetails(101,"oracle",960990,"Delhi","2015-01-02");
		try {
			conne=MyConnection.getConnection();
			statement= conne.createStatement();
			String sql="UPDATE User SET name='"+com.getName()+"' ,turnover = "+com.getTurnover() + "WHERE comapnyId = "+com.getCid()+";";
			i= statement.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public List<CompanyDetails> getAllCompany() {
		Statement statement = null;
		Connection connection = null;
		List<CompanyDetails> companyList = new ArrayList<CompanyDetails>();
		ResultSet res = null;
		try {
			connection = MyConnection.getConnection();
			statement = connection.createStatement();
			String sql = "SELECT * FROM User";
			res = statement.executeQuery(sql);
			if(res.next()) {
				do {
					CompanyDetails company = new CompanyDetails();
					company.setCid(res.getInt(1));
					company.setName(res.getString(2));
					company.setTurnover(res.getLong(4));
					company.setAddress(res.getString(3));
					company.setDate(res.getString(5));
					
					companyList.add(company);
				}while(res.next());
			}else {
				System.out.println("Please try again");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return companyList;
	}
	

}
