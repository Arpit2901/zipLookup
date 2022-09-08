package com.linked.list;

import java.util.Scanner;

public class SinglyList extends Node{
	private Node head;
	private Node last;
	private String choice;
	public SinglyList() {
		head=null;
		last=null;
	}
	public void fill() {
		do {
			Scanner sc=new Scanner(System.in);
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
			System.out.println("Do you want to add new node");
			choice =sc.next();
		}while(choice.equalsIgnoreCase("yes"));
	}
	
	    public void display() {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.getData() + " ");    
	            current = current.getNext();    
	        }    
	        System.out.println();    
	    
		}
	}
		

