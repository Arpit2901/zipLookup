package com.java.abstractex;

class Honda extends Bike {
	void run1() {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run1();
		// AbstrtactClassName obj=new SubClass(0);
	}
}
