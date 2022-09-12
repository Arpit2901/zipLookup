package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CountryNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> lt= new LinkedList();
		lt .add("Dubai");
		lt .add("USA");
		lt .add("India");
		lt .add("Russia");
		lt .add("France");
		
		List ar=new ArrayList();
		ar=lt;
		Iterator <String> it=lt.iterator();
		
		System.out.println("iterator using Linked list ");
		while(it.hasNext()) {
			System.out.println(it.next()+" 	");
		}
		Iterator <String> ut=ar.iterator();
		System.out.println("iterator using Array list ");
		while(ut.hasNext()) {
			System.out.println(ut.next()+" 	");
		}
	}

}
