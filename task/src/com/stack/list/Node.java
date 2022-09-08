package com.stack.list;

public class Node {
		private int data;
		private Node next;
		public Node() {
			
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		public static Node getNode(int data){
			//create empty node 2. Assign data to data part and null to next part 3 return node
			Node node =new Node();
			node.data=data;
			node.next=null;
			return node;
		}

	}
