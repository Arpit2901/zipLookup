package com.exception.handling;

import java.util.ArrayList;
import java.util.List;

public class ItemDetails {
private int itemID;
private Double price;
private String name;
public int getItemID() {
	return itemID;
}
public void setItemID(int itemID) {
	this.itemID = itemID;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ItemDetails(int itemID, Double price, String name) {
	super();
	this.itemID = itemID;
	this.price = price;
	this.name = name;
}

}
