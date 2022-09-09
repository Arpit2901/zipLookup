package com.searching.demo;

public class LinearSearch {
	public static void search(int s,int[] arr) {
		int index=0;
		for (int i=0;i<arr.length;i++) {
			if(s==arr[i]) {
				 index=i;
				break;
			}
		}
		System.out.println("element found at index "+index);
	}

}
