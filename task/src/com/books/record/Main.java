package com.books.record;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc =new Scanner(System.in);
		   Books b[];
	        b = new Books[5];
		List<Books> book=new ArrayList<>();
	        
	        book.add( new Books(1,"Ramayan",1000,29.01));
	        book.add(  new Books(2,"Mahabharat",500,22.02));
	        book.add( new Books(3,"2States",700,22.12));
	        book.add( new Books(4,"Wings",450,11.06));
	        book.add(  new Books(5,"Callcenter",550,13.04));
	        
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("The Card Holder Details are : ");
	        book.forEach(System.out::println);
	        System.out.println("-----------------------------------------------------------");
	        System.out.println("Enter the name of the bookto search");
	        String name=sc.next();
      
	        for(int i=0;i<book.size();i++){
	        	if(name.equalsIgnoreCase(book.get(i).getBookName())) {
	        		System.out.println(book.get(i));
	        	}
	        }
	        System.out.println("sorting on the basis of price");
	        Collections.sort(book);
	        book.forEach(System.out::println);
	    
	        
	        

	}

}
