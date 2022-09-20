package com.Lambda.supplier;

import java.util.Scanner;

public class LambdaOpertion{
	
	    public static void main(String[] args) { 
	    	
	    	
	    	
	    	//lambda expression with argument
	    	MyInterface2 s1=()->{  
	    		return "Hello ";  
	    	};  
	    	System.out.println(s1.say());  	
	    	
	        MyInterface s2= name ->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s2.say("Monu"));  
	    }  

}
