package com.queue.list;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		Main obj=new Main();
		Queue node=new Queue();
		do {
			System.out.println("Enter 1-insert |2-delete |3-display from the queue");
			int choice=sc.nextInt();
			obj.choice(choice,node);
			System.out.println("Do you want to insert or delete or display new node then 1 else 0");
			n=sc.nextInt(); 
		}while(n>0);

	}
	public void choice(int choice,Queue node) {
		switch(choice) {
		case 1:
			node.insert();
			node.display();
			break;
		case 2:
			node.delete();
			break;
		case 3:
			node.display();
			break;
		default:
			System.out.println("wrong choice");
		}
		
	}

}
