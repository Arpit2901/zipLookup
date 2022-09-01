package staticPrograms;

import java.util.Scanner;

public class cube {
	private static int n;
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		display();
	}
	 public static void display() {
		 System.out.println("cube ="+n*n*n);
	 }
}
