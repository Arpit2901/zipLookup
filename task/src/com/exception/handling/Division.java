package com.exception.handling;

public class Division {
	 public void test(int val1,int val2) {
     try {
         System.out.println(val1 / val2); // throw Exception
     }
     catch (ArithmeticException e) {
         // Exception handler
         System.out.println(
             "Divided by zero operation cannot possible");
     }
     catch(Exception e){
    	 System.out.println(e);
     }
//     catch(NullPointerException e){
//    	 System.out.println("NullPointerException ");
//     }
     finally {
         System.out.println("Inside finally block.");  
     }
	 }
     
}
