package com.demo.overriding;

class Bank {
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank {
	float getRateOfInterest() {
		return 7.3f;
	}
}

class AXIS extends Bank {
	float getRateOfInterest() {
		return 9.7f;
	}
}

class TestPolymorphism {
	public static void main(String args[]) {
		
	//	ParentClass obj=New SubClass();
		Bank b;
		Bank b1=new AXIS();
		b1.getRateOfInterest();
	//	SuperclassName obj=New SubClassName();
		//Bank b=new SBI();
		b = new SBI();
		System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS Rate of Interest: " + b.getRateOfInterest());
	}
}
