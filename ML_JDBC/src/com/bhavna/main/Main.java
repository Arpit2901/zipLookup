package com.bhavna.main;

import java.text.ParseException;

import com.bhavna.dao.Operations;
import com.bhavna.service.Service;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		Operations obj=new Operations();
		obj.fetchData();
		//save emp and dep tables
		Service sev=new Service();
		sev.inputEmp();
//		sev.inputDep();
		//update emp table
		sev.updateEmpData();
		//employees whose salry is greter then 30k
//		obj.employeesAbove30K();
		
		
		
	
		
		
		
		
	}


}
