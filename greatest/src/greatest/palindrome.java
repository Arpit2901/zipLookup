package greatest;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int i,n,r,s=0;
		n=sc.nextInt();
		i=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(s==i) {
			System.out.print("palindrome number");
		}else
			System.out.print("not a palindrome number");
	}

}
