package recursion;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		tab(n,1);
		
	}
	public static void tab(int n,int i) {
		if(i>10)
			return ;
		  
		 System.out.println(n+"X"+i+"="+n*i);
		 tab(n,i+1);
	}
}
