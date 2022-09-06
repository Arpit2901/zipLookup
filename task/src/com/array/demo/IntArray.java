package com.array.demo;

import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int s=0;
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			s=s+arr[i];
		}
		System.out.println("list of all elements");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sum of all elements"+s);
		IntArray obj=new IntArray();
		obj.sum(arr);
		obj.sum(n,arr);
		
		
	}
	public void sum (int s,int arr[]) {
		int sum =0;
		for (int i=0;i<s;i++) {
			if(arr[i]%2==0)
				sum =sum+arr[i];
		}
		System.out.println("sum of even nums ="+sum);
	}
	public void sum(int arr[]) {
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				sum =sum+arr[i];
		}
		System.out.println("sum of odd nums ="+sum);
	}

}
