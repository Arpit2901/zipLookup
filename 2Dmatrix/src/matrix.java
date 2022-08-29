import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner (System.in);
int [] []A= new int [3][3];
int [] []B= new int [3][3];
 System.out.println("enter the numbers of array A and B");
 for(int i=0;i<3;i++) {
	 for(int j=0;j<3;j++) {
		 A[i][j]=sc.nextInt();
		 B[i][j]=sc.nextInt();
	 }
 }
 for(int i=0;i<3;i++) {
	 for(int j=0;j<3;j++) {
		 A[i][j]=A[i][j]+B[i][j];
		 System.out.print(A[i][j]+"  ");
		 
	 }
	 System.out.println();
 }


	}

}
