package com.exception.handling;

public class HandleExceptions {
	 public int getStringSize(String str) throws Exception{
	        if(str == null){
	            throw new Exception("String input is null");
	        }
	        return str.length();
	    }

}
