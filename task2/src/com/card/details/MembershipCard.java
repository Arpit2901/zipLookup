package com.card.details;

public class MembershipCard extends Card {

	private Integer rating;
	public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NAME="+holderName+"\n"+ "CARDNUMBER="+cardNumber+"\nEXPIRYDATE="+expiryDate+"\nRatings="+rating);
	}

}
