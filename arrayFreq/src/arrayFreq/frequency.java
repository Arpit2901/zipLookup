package arrayFreq;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A= {1,2,3,1,5,3,1,4};
		boolean visited[] = new boolean[8];
		int ctr;
    for(int i=0;i<A.length;i++) {
    	ctr=0;
    	if(visited[i]==true) {
    		continue;
    	}
    	for(int j =0;j<A.length;j++) {
    		if(A[i]==A[j]) {
    			visited[j]=true;
    			ctr++;
    		}
    	}
    	System.out.println("the element"+A[i]+"="+ctr );
    }
     
	}

}
