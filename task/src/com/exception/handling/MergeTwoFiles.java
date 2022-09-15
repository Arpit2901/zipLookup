package com.exception.handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MergeTwoFiles {
	public void merging(){
		try {
			File file=new File("d://av/av.txt");
			File file2=new File("d://av/ap.txt");
			if(file.exists()&&file.isFile()) {
				FileReader reader=new FileReader(file);
				FileReader reader2=new FileReader(file2);
				FileWriter writer=new FileWriter("d://av/merge.txt",true);
				
				 Scanner Reader = new Scanner(file);
				 Scanner Reader2 = new Scanner(file2);
		            while (true) {
		            	int i=reader.read();
		            	int j=reader2.read();
		            	if(i==-1&&j==-1)
		            		break;
		                
		               writer.write(i);
		               writer.write(j);
		               System.out.print((char)i);
		               System.out.print((char)j);
//		               writer.close();
		            }
		       
		            
		               writer.close();
			}else {
				System.out.println("file doesnt exist");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
