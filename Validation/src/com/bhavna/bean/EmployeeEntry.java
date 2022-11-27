package com.bhavna.bean;

import java.sql.Timestamp;

public class EmployeeEntry {
private String name;
private String datetime;



@Override
public String toString() {
	return " [name=" + name + ", datetime=" + datetime + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDatetime() {
	return datetime;
}
public void setDatetime(String datetime) {
	this.datetime = datetime;
}
public EmployeeEntry(String name, String datetime) {
	super();
	this.name = name;
	this.datetime = datetime;
}


}
