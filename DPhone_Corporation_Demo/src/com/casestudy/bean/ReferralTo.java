package com.casestudy.bean;

import java.io.Serializable;

public class ReferralTo implements Serializable {
	private String name;
	private String mobile;
	private String email;
	public ReferralTo(String name, String mobile, String email) {
		super();
		this.setName(name);
		this.setMobile(mobile);
		this.setEmail(email);
	}
	public String nameCheck(String name) {
		name="";
		return name;
		
	}
	@Override
	public String toString() {
		return " [name=" + getName() + ", mobile=" + getMobile() + ", email=" + getEmail() + "]";

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
