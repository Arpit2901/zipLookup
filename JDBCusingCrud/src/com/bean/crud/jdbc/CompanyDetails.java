package com.bean.crud.jdbc;

import java.sql.Date;
import java.time.LocalDate;

public class CompanyDetails {
	private int Cid;
	private String name ;
	private long turnover;
	private String address;
	public String date;
	
	
	public CompanyDetails(int cid, String name, int i, String address, String date) {
		super();
		Cid = cid;
		this.name = name;
		this.turnover = i;
		this.address = address;
		this.date = date;
	}
	public CompanyDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CompanyDetails [Cid=" + Cid + ", name=" + name + ", turnover=" + turnover + ", address=" + address
				+ ", date=" + date + "]";
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTurnover() {
		return turnover;
	}
	public void setTurnover(long l) {
		this.turnover = l;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
