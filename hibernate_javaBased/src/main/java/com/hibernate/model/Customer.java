package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int custid;
	private String custName;
	private String custPhone;
	private int orderId;

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public Customer(int custid, String custName, int orderId) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.orderId = orderId;
	}

	

}
