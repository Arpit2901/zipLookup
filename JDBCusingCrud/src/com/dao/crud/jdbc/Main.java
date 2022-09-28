package com.dao.crud.jdbc;

import java.util.List;

public class Main {
	public static void main(String args[]) {
		MyConnection obj=new MyConnection();
//		obj.getConnection();
		Queries query=new Queries();
//		int i =query.UpdateCompany();
		List l=query.getAllCompany();
//		System.out.println("connection"+i);
		System.out.println(l);
	}
}
