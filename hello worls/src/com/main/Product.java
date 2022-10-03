package com.main;

public class Product {
	private String color;
	private String size;
	private  int price;
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "Product [color=" + color + ", size=" + size + ", price=" + price + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String color, String string, int price) {
		super();
		this.color = color;
		this.size = string;
		this.price = price;
	}
}
