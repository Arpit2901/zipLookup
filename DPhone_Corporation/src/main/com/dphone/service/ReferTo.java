package main.com.dphone.service;

public class ReferTo implements java.io.Serializable {
	String name;
	String mobile;
	String email;
	public ReferTo(String name, String mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
//	public ReferTo() {
//		// TODO Auto-generated constructor stub
//	}
	public String nameCheck(String name) {
		name="";
		return name;
		
	}
	@Override
	public String toString() {
		return " [name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}
