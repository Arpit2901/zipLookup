package com.exception.handling;

import java.io.FileNotFoundException;
import java.rmi.AccessException;

public class ClausMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThrowsClause obj=new ThrowsClause();
	try {
		obj.getFile("D://av");
	} catch (AccessException | FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
