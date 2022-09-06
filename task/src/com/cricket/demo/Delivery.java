package com.cricket.demo;

public class Delivery {
	public void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("baller is "+bowler+"&& the batsman is "+batsman);
	}
	void displayDeliveryDetails(long run) {
		if(run==4) {
			System.out.println("its a boundary!!!"+run);
		}
		else if(run==6) {
			System.out.println("its a Sixer!!!"+run);
		}
		else {
			System.out.println(run+" || runs!! ");
		}
	}
}
