package recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		fibonacci obj=new fibonacci();
		  for(int i=0;i<n;i++) {
			  System.out.print(obj.fibo(i)+",");
	        }
		
		
	}
	public static int fibo(int n) {
		   if(n<=1) {
	            return n;
	        }	
		return fibo(n-1)+fibo(n-2);
	}

}





