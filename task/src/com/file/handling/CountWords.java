package com.file.handling;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
	private int count=0;
	private int up=0,low=0;
	private static int digits=0;
	private static int vowels=0;
		public void countLetters() {
		try {
			File file=new File("d://av/av.txt");
			if(file.exists()&&file.isFile()) {
				FileReader reader=new FileReader(file);
		
				 Scanner Reader = new Scanner(file);
		            while (Reader.hasNextLine()) {
		                String data = Reader.nextLine();
		                System.out.println(data);
		                for(int i=0;i<data.length();i++) {
		                	char ch=data.charAt(i);
		                	if(ch>=65&&ch<=90) {
		                		up++;
		                	}
		                	else if(ch>=97&&ch<=122){
		                		low++;
		                	}
		                	
		                }
		                System.out.println("upper case letters"+up);
		                System.out.println("lower case letters"+low);  
		                digits(data);
		                vowels(data);
		            }
		            Reader.close();
			}else {
				System.out.println("file doesnt exist");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		public static void digits(String s) {
			  for(int i=0;i<s.length();i++) {
              	char ch=s.charAt(i);
              	if(ch>=48&&ch<=57) {
              		digits++;
              	}
			  }
			  System.out.println("Digits="+digits);
		}
		public static void vowels(String s) {
			 for(int i=0;i<s.length();i++) {
	              	char ch=s.charAt(i);
	              	switch(ch) {
	              	case 'a':
	              		vowels++;
	              		break;
	            	case 'e':
	              		vowels++;
	              		break;
	            	case 'i':
	              		vowels++;
	              		break;
	            	case 'o':
	              		vowels++;
	              		break;
	            	case 'u':
	              		vowels++;
	              		break;
	            	case 'A':
	              		vowels++;
	              		break;
	            	case 'E':
	              		vowels++;
	              		break;
	            	case 'I':
	              		vowels++;
	              		break;
	            	case 'O':
	              		vowels++;
	              		break;
	            	case 'U':
	              		vowels++;
	              		break;
	              	}
			 }
			System.out.println("vowels="+vowels);
		}
		
	
	public int countWords() {
		try {
			File file=new File("d://av/av.txt");
			if(file.exists()&&file.isFile()) {
				FileReader reader=new FileReader(file);	
			}else {
				System.out.println("file doesnt exist");
			}
		Scanner Reader = new Scanner(file);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
		 StringTokenizer st = new StringTokenizer(data," ");  
         System.out.println("Total number of Tokens: "+st.countTokens());
         
        }
	}catch(Exception e) {
		System.out.println(e);
	}
		return 0;
	}
}


