package com.bhavna.main;

import java.text.ParseException;

import com.bhavna.dao.Operations;
import com.bhavna.service.Service;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		Operations obj=new Operations();
		obj.fetchData();
		Service sev=new Service();
//		sev.inputEmp();
		sev.inputDep();
	
		
		
		
		
	}


}
