package com.exception.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.AccessException;

public class ThrowsClause {
	public void getFile(String dirPath) throws FileNotFoundException, AccessException  {

	        try {
	            File f = new File(dirPath);
	            File[] files = f.listFiles();
	            int count = 0;
	            for (int i = 0; i < files.length; i++) {
	                count = count+1;
	                File file = files[i];
	         
	                if (file.isDirectory()) {    
	                     getFile(file.getAbsolutePath());  
	                }
	            }
	            System.out.println(" The count of the files in the folder are : " + count);
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        

}
	
}
