package com.searching.demo;

import java.util.Scanner;

public class BMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]=new int [6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element tobe found");
		int ele=sc.nextInt();
		int ll=0;
		int ul=5;
		Binary.search(arr, ele, ll, ul);
	}

}
