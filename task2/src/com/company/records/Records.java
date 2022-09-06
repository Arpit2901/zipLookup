package com.company.records;

public class Records {
	private int cid;
	private String name;
	private String city;
	private long turnover;
	private int employees;
	public Records(int cid, String name, String city, long turnover, int employees) {
		super();
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.turnover = turnover;
		this.employees = employees;
	}
	public void display() {
		System.out.println(cid+"\t"+name+ "\t"+ city +"\t "+turnover+ "\t" +employees );
		
	}
	public void display(String inCity) {
		if(city.equalsIgnoreCase(inCity))
			System.out.println(cid+"\t"+name+ "\t"+ city +"\t "+turnover+ "\t" +employees );
		
	}
	public void displayTurnOver() {
		if(turnover>1000&&turnover <10000)
			System.out.println(cid+"\t"+name+ "\t"+ city +"\t "+turnover+ "\t" +employees );
		
	}
	public void displayGreaterThan100() {
		if(employees>100)
			System.out.println(cid+"\t"+name+ "\t"+ city +"\t "+turnover+ "\t" +employees );
		
	}
}
