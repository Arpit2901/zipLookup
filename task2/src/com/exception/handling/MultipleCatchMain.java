package com.exception.handling;

import java.io.FileNotFoundException;

public class MultipleCatchMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		MultipleCatches obj=new MultipleCatches();
		obj.exceptionTester(1);
		obj.exceptionTester(2);
		obj.exceptionTester(3);
	}

}
