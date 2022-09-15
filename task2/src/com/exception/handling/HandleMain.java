package com.exception.handling;

public class HandleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        try{
	            HandleExceptions met = new HandleExceptions();
	            System.out.println("length of JUNK is "+met.getStringSize("JUNK"));
	            System.out.println("length of WRONG is "+met.getStringSize("WRONG"));
	            System.out.println("length of null string is "+met.getStringSize(null));
	        } catch (Exception ex){
	            System.out.println("Exception message: "+ex.getMessage());
	        }
	    }
	}


