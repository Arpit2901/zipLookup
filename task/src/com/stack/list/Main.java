package com.stack.list;

import java.util.Scanner;

import com.linked.list.SinglyList;

public class Main {
	private static boolean b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Main obj=new Main();
		Stack node=new Stack();
		do {
			System.out.println("Enter 1-push |2-pop |3-display from the stack");
			int choice=sc.nextInt();
			obj.choice(choice,node);
			System.out.println("Do you want to push or pop or display new node then true else false");
			 b=sc.nextBoolean();
		}while(b);

		
	}
	public void choice(int choice,Stack node) {
		switch(choice) {
		case 1:
			node.push();
			node.display();
			break;
		case 2:
			node.pop();
			break;
		case 3:
			node.display();
			break;
		default:
			System.out.println("wrong choice");
		}
		
	}

}
