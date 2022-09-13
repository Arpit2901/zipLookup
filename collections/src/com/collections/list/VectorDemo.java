package com.collections.list;

import java.util.Vector;

public class VectorDemo {

	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Vector<String> vec=new Vector<String>();
	        vec.addElement("Aman");
	        vec.addElement("Sahil");
	        vec.addElement("Vivek");
	        vec.addElement("Manish");
	        
	        System.out.println("Vec size: "+vec.size());
	        System.out.println("Vec capacity: "+vec.capacity());
	        
	        vec.insertElementAt("New",3);
	        System.out.println("Vec after inserting element at specified location: "+vec);
	        
	        vec.remove("Vivek");
	        System.out.println("Vec after removing Vivek from it: "+vec);
	        
	        vec.setElementAt("Amandeep",0);
	        System.out.println("Vec after updating element at index 0: "+vec);
	}

}
