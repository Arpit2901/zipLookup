package com.maven.Jdbcdemo.dao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConnection obj=new MyConnection();
		obj.getConnection();
		PreparedStQueries query=new PreparedStQueries();
//		int i=query.addCompany();
		int i =query.UpdateCompany();
//		int i=query.deleteData();
		System.out.println("connection"+i);

	}

}
