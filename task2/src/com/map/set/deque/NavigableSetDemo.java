package com.map.set.deque;

import java.util.*;
import java.io.*;
public class NavigableSetDemo {
	 
	    public static void main(String[] args) {
	        NavigableSet<String> ts = new TreeSet<String>();
	        
	        ts.add("Ram");
	        ts.add("Jam");
	        ts.add("Sam");
	        ts.add("Bam");
	        ts.add("Tam");
	        
	        System.out.println(ts);
	        
	        for (String value : ts)
	            System.out.println(value);
	        
	        String check = "Ram";
	        System.out.println(ts.contains(check));
	        System.out.println("First Value " + ts.first());
	        System.out.println("Last Value " + ts.last());
	        ts.remove("Bam");
	        ts.pollFirst();
	        ts.pollLast();
	        for (String value : ts)
	            System.out.println(value);
	    }
	}

