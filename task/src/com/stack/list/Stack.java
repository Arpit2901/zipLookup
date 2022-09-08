package com.stack.list;

import java.util.Scanner;

import com.linked.list.Node;

public class Stack {
	private Node head;
	private Node last;
	
	public Stack() {
		head=null;
		last=null;
	}
	Scanner sc=new Scanner(System.in);
	public void push() {
		do {
			System.out.println("Enter the data");
			int data=sc.nextInt();
			Node node=Node.getNode(data);
			if(head==null) {
				head=node;
				last=node;
			}else {
				last.setNext(node);
				last=node;
			}
			System.out.println("pushed successfully");
		
		}while(false);
	}
		public void pop() {
			  if (last == null) {
		            System.out.print("\nStack Underflow");
		            return;
		        }
			  System.out.println("popped successful"+last.getData()); 
//		        last = last.getNext();
		        Node current = head;
		        while(current.getNext() != null) {
		        	System.out.println(current.getNext()+"popped successful"+last); 
		        	if(current.getData()==last.getData()) {
		        		head=null;
		        		break;
		        	}
		        	else if(current.getNext()==last) {
		        		break;
		        	}
		        	System.out.println("after elif");
		        }  
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
