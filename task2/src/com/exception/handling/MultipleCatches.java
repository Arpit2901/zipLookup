package com.exception.handling;

import java.io.File;
import java.io.FileNotFoundException;

public class MultipleCatches {
	public void exceptionTester(int n)  throws FileNotFoundException {
		try {
			int val2=0;
			switch(n){
				case 1:
					if(val2==0) throw new ArithmeticException("value is  0"); 
			
				case 2:
					boolean[] arr=new boolean[5];
					if(arr[5]) {
						throw new NullPointerException("arr[5] not exist");
					}
				case 3:
					File f=new File("D://ATemp.txt");
					if(!f.exists()) {
						throw new FileNotFoundException("file not found");
					}
			}
		}catch(NullPointerException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
