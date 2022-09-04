package com.area.shapes;

public class Rectange extends Shape{
	public int length;
	public int breadth;
	
	public Double calculateArea() {
		double area=length*breadth;
		return area;
		
	}

	public Rectange(String shapeName, int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
	
	
}
