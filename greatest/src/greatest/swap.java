package greatest;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		swap obj=new swap();
		obj.using3Swap(n, m);
		obj.witout3Swap(n, m);
		
	}
	public void using3Swap(int n,int m) {
		int b;
		System.out.println("numbers are n="+n+"and m="+m);
		b=m;
		m=n;
		n=b;
		System.out.println("after swapping n="+n+"and m="+m);
		
	}
	public void witout3Swap(int a,int b) {
		System.out.println("numbers are n="+a+"and m="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("after swapping n="+a+"and m="+b);
	}
	}

