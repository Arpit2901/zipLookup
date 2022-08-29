import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int ar[] =new int[n];
		for(int i =0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		 Arrays.sort(ar);
		 System.out.println("2nd largets number is"+ar[n-2]);

	}

}
