package com.area.shapes;

public class Hexagon extends Shape{
	public int side;

	public Hexagon(String shapeName, int side) {
		super("Hexagon");
		this.side = side;
	}
	public Double calculateArea() {
		double area=1.5*1.732*side*side;
		return area;
	}

}
