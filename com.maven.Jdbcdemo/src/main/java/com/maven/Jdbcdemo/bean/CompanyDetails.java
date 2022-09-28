package com.maven.Jdbcdemo.bean;

import java.sql.Date;
import java.time.LocalDate;
public class CompanyDetails {
		private int Cid;
		private String name ;
		private int turnover;
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
		public int getTurnover() {
			return turnover;
		}
		public void setTurnover(int turnover) {
			this.turnover = turnover;
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
