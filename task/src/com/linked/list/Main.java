package com.linked.list;

public class Main {
	public static void main(String [] args) {
		Node node=Node.getNode(10);
//		System.out.println(node.getData());
//		System.out.println(node.getNext());
		SinglyList node2=new SinglyList();
		node2.fill();
		node2.display();
	}
}
