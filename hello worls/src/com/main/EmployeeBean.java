package com.main;

public class EmployeeBean {
private String Name;
private String Location;
public EmployeeBean(String name, String location) {
	super();
	Name = name;
	Location = location;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}

}
