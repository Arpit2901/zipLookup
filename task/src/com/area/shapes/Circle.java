package com.area.shapes;

public class Circle extends Shape{
	public int radius;
	public Circle(String shapeName, int radius) {
		super("Circle");
		this.radius = radius;
	}
	public Double calculateArea() {
		double area=3.141*radius*radius;
		return area;
	}
	

}
