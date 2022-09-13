package com.set.task;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<BookDetails> book=new HashSet<BookDetails>();
		BookDetails Book1=new BookDetails(101,"museum","Arpit verma",250.0);
		BookDetails Book2=new BookDetails(102,"stars in the sky","Tushar verma",300.0);
		BookDetails Book3=new BookDetails(103,"2states","Chetan bhagat",180.0);
		BookDetails Book4=new BookDetails(104,"3 mistakes of my life","Chetan Bhagat",150.0);
		BookDetails Book5=new BookDetails(105,"merchant of venice","winston churchill",220.0);
		BookDetails Book6=new BookDetails(105,"much ado about nothing","Shakespeare",200.0);
		book.add(Book1);
		book.add(Book2);
		book.add(Book3);
		book.add(Book4);
		book.add(Book5);
		book.add(Book6);
		for(BookDetails details:book) {
			System.out.println(details);
		}
		System.out.println("\ndisplaying books in the decreasing order of price\n");
		TreeSet<BookDetails> priceSort=new TreeSet<>(book);
	        priceSort.forEach(System.out::println);
		
	}

}
