package com.area.shapes;

public class Square extends Shape{
	public int side;
	public Double calculateArea() {
		double area=side*side;
		return area;
	}
	public Square(String shapeName, int side) {
		super("Square");
		this.side = side;
	}

}
