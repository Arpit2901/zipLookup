package com.books.record;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc =new Scanner(System.in);
		   Books b[];
	        b = new Books[5];
	        
	        b[0] = new Books(1,"Ramayan",1000,29.01);
	        b[1] = new Books(2,"Mahabharat",500,22.02);
	        b[2] = new Books(3,"2States",700,22.12);
	        b[3] = new Books(4,"Wings",450,11.06);
	        b[4] = new Books(5,"Callcenter",450,13.04);
	        
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("The Card Holder Details are : ");
	        for(Books cd1: b) {
	            cd1.display();
	        }
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("Enter the name of the bookto search");
	        String name=sc.next();
	        for(Books cd1: b) {
	            cd1.search(name);
	        }
	        for(Books cd1: b) {
	            cd1.compareTo(cd1);
	        }
	        

	}

}
