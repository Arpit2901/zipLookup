package com.sorting.demo;

public class IMain {

	public static void main(String[] args) {
	     int arr[] = { 12, 11, 13, 5, 6 };
	     
	        insertionSort ob = new insertionSort();
	        ob.sort(arr);
	  
	        insertionSort.printArray(arr);
	    }
	}

