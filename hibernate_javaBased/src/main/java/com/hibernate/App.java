//package com.hibernate;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Entity;
//
//import org.springframework.context.annotation.ComponentScan;

//import com.hibernate.dao.OrderDao;
//import com.hibernate.model.Customer;
//import com.hibernate.model.Orders;
//public class App {
//public static void main(String[] args) {
//	SpringApplication.run(App.class, args);
//	System.out.println("connected");
//	OrderDao odc=new OrderDao();
//	Customer c1=new Customer(101,"Arpit",1);
//	Customer c2=new Customer(102,"mohit",1);
//	Orders od=new Orders(1,"car");
//	Set <Customer> customers=new HashSet<>();
//	customers.add(c2);
//	customers.add(c2);
//	od.setCustomers(customers);
//	odc.saveOrder(od);
	
	//get order by id
	
//	Orders od2=odc.getOrderById(1);
//	System.out.println(od2);
//}
//}
