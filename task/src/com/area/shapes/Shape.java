package com.area.shapes;

public class Shape {
	protected String shapeName;
	
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
//		calculateArea();
	}
	
	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public Double calculateArea(){
//		System.out.println("in parent class");
		return 0.0;
	}
	}
