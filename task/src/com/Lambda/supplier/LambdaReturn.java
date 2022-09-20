package com.Lambda.supplier;

public class LambdaReturn {
	public static void main(String arg[]) {
    Addable ad2=(int a,int b)->{  
        return (a+b);   
        };  
System.out.println(ad2.add(100,200));  
	}
}
