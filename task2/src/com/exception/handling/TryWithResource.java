package com.exception.handling;

import java.io.FileOutputStream;

public class TryWithResource {
	public void tryWithResource() {
		try(FileOutputStream fileOutputStream =new FileOutputStream("D://av/new.txt")){      
			String msg = "Welcome to javaTpoint!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}catch(Exception e){  
			       System.out.println(e);  
			}      
	}
}
