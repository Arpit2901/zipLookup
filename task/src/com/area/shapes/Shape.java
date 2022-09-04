package com.area.shapes;

public class Shape {
	protected String shapeName;
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
		calculateArea();
	}
	
	public Double calculateArea(){
//		System.out.println("in paret class");
		return 0.0;
	}
	}
