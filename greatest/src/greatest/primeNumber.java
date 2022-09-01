package greatest;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int i,n,ctr=0;
		n=sc.nextInt();
		for(i=2;i<n/2;i++) {
			if(n%i==0) {
				ctr++;
				break;
			}
			
		}
	if(ctr==1) {
		System.out.print("not a prime number");
	}else
		System.out.print("prime number");

}
}
