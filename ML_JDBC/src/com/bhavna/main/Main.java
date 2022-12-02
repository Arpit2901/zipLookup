package com.bhavna.main;

import java.rmi.server.Operation;

import com.bhavna.dao.Operations;
import com.bhavna.utility.MyConnection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyConnection.getConnection();
		Operations obj=new Operations();
		obj.fetchData();
		
	}


}
