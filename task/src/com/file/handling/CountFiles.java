package com.file.handling;

import java.io.File;

public class CountFiles {
	public static void main(String[] args) {
		int fileCount=0,folder=0;
		
		try {
			File directory = new File("D://av");
			for (File file : directory.listFiles()) {
				if (file.isFile()) {
					fileCount++;
				}if (file.isDirectory()) {
					folder++;
				}
			}
			
			System.out.println("File Count=" + fileCount);
			System.out.println("Folder Count=" +folder);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
