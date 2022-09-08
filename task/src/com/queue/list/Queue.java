package com.queue.list;

import java.util.Scanner;

import com.linked.list.Node;

public class Queue {
	private Node head;
	private Node last;
	private Node top;
	
	public Queue() {
		head=null;
		last=null;
		top=null;
	}
	Scanner sc=new Scanner(System.in);
	public void insert() {
		do {
			System.out.println("Enter the data");
			int data=sc.nextInt();
			Node node=Node.getNode(data);
			if(head==null) {
				head=node;
				last=node;
				top =node;
			}else {
				top=node;
				top.setNext(head);
				head=node;
			}
			System.out.println("inserted successfully");
		
		}while(false);
	}
		public void delete() {
			  if (top == null) {
		            System.out.print("\nQueue Underflow");
		            return;
		        }
			  System.out.println("deleted successful ="+last.getData()); 
			  Node current = top;
			  while(current.getNext() != last) {    
		            current = current.getNext();    
		        }   
			  current.setNext(null);
		        last=current;
		}
	
	    public void display() {      
	        Node current = head;  
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {
	            System.out.print(current.getData() + "--> ");    
	            current = current.getNext();    
	        }    
	        System.out.println();    
	    
		}
}
