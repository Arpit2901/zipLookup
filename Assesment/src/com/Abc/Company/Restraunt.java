package com.Abc.Company;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;  

public class Restraunt {
	private int latitude;
	private int longitude;
	public int getLat() {
		return latitude;
	}
	public void setLat(int lat) {
		this.latitude = lat;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongi(int longitude) {
		this.longitude = longitude;
	}
	public Restraunt(int lattitude, int longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Restraunt() {
		// TODO Auto-generated constructor stub
	}
	public int getRadius() {
		int n= (int)Math.random();
		return n ;
	}
	public List restraunt() {
		 List<String> lst=new ArrayList<String>();
		    lst.add("Krishna restraunt");
		    lst.add("Taj Hotel");
		    lst.add("Hotel Walia");
		    lst.add("kanha Restraunt");
		    lst.add("Chadda Restraunt");
		    lst.add("Verma Restraunt");
		    lst.add("Agarwal Restraunt");
		    lst.add("Singh Restraunt");
		    return lst;
	}
	
	

}
