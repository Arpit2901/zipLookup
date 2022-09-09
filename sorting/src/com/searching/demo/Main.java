package com.searching.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int[] arr=new int[7];
		for (int i=0;i<7;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int s=sc.nextInt();
		LinearSearch.search(s,arr);
	}

}
