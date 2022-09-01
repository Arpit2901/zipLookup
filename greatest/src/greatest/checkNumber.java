package greatest;

import java.util.Scanner;

public class checkNumber {
	public static void main(String[] args) {
	int n;
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	
	if(n>0) {
		System.out.print("n is positive"+n);
	}
	else if(n==0) {
		System.out.print("n is zero"+n);
	}
	else
		System.out.print("n is negative "+n);

}	
}
