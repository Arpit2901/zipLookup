package com.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Orders {

	@Id
	private int id;
	private String item;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "custo", joinColumns = @JoinColumn(name = "Orders", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "Customer", referencedColumnName = "orderId"))
	private Set<Customer> customers;

	public Orders(int id, String item) {
		super();
		this.id = id;
		this.item = item;
	
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

	
	public Set customers() {
		return customers;
	}

	public void setCustomers(Set<Customer> c1) {
		this.customers = (Set<Customer>) c1;
	}

	public Orders() {
		super();
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", item=" + item + ", custId=" + customers + "]";
	}

	

}
