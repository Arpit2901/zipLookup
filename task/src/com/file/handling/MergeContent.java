package com.file.handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MergeContent {
	public void merging() {
		try {
			File file=new File("d://av/av.txt");
			File file2=new File("d://av/ap.txt");
			if(file.exists()&&file.isFile()) {
				FileReader reader=new FileReader(file);
				FileReader reader2=new FileReader(file2);
				FileWriter writer=new FileWriter("d://av/merge.txt",true);
				
				 Scanner Reader = new Scanner(file);
		            while (Reader.hasNextLine()) {
		                String data = Reader.nextLine();
		               writer.write(data);
		               System.out.println("file done=="+data);
//		               writer.close();
		            }
		            Scanner Reader2 = new Scanner(file2);
		            while (Reader2.hasNextLine()) {
		                String data2 = Reader2.nextLine();
		               writer.write(data2);
		               System.out.println("file done=="+data2);
		               writer.close();
		            }
			}else {
				System.out.println("file doesnt exist");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
