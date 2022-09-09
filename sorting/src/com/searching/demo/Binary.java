package com.searching.demo;

public class Binary {
	public static void search(int arr[],int ele ,int ll,int ul) {
		int mid;
		while(ll<ul) {
			mid=(ll+ul)/2;	
			if(ele==arr[mid]) {
				System.out.println("element found"+mid+1);
				return;
			}
			else if(arr[mid]>ele) {
				ul=mid-1;
			}
			else {
				ll=mid+1;
			}
		}
		if(arr[ul]==ele) {
			System.out.println("element found="+ul+1);
		}else
		   System.out.println("Not Found" );
	}
}
