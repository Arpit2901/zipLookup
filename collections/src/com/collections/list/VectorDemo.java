package com.collections.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        Vector<Integer> v = new Vector<Integer>(n);
	        for (int i = 1; i <= n; i++)
	            v.add(i);
	        System.out.println(v);
	}

}
