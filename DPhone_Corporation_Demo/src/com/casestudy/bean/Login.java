package com.casestudy.bean;

public class Login {

	private String username;

	public Login(String username) {
		super();
		this.username = username;

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Login() {
		System.out.println("######### Login Page ###########");

	}

}
