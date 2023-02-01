package com.hibernate.main;

import com.hibernate.dao.OrderDao;
import com.hibernate.model.Orders;

public class App {
public static void main(String[] args) {
	OrderDao odc=new OrderDao();
	Orders od=new Orders(2,"car",011);
	odc.saveOrder(od);
	Orders od2=odc.getOrderById(1);
	System.out.println(od2);
}
}
