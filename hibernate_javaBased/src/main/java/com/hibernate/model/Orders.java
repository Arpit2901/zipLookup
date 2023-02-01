package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	private int id;
	private String item;
	private int custId;

	public Orders(int id, String item, int custId) {
		super();
		this.id = id;
		this.item = item;
		this.custId = custId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Orders() {
		super();
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", custId=" + custId + "]";
	}
	
	
}
