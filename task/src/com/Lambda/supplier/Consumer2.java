package com.Lambda.supplier;

import java.util.function.Consumer;

public class Consumer2 {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Consumer<Integer> ref=(num)->{
	            if(num>=0) {
	                System.out.println("its whole Number");
	            }else {
	                System.out.println("its negative Number");
	            }
	        };
	        
	        ref.accept(-10);
	        ref.accept(15);
	        ref.accept(0);
	    }

}
