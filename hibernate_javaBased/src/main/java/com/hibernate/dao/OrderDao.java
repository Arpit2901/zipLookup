//package com.hibernate.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.hibernate.model.Orders;
//import com.hibernate.util.Util;
//
//public class OrderDao {
//	public void saveOrder(Orders order) {
//		Transaction transaction = null;
//		try (Session session = Util.getSessionFactory().openSession()) {
//			// start a transaction
//			transaction = session.beginTransaction();
//			// save the student object
//			session.save(order);
//			// commit transaction
//			transaction.commit();
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		}
//	}
//	public void updateOrder(Orders order) {
//		Transaction transaction = null;
//		try (Session session = Util.getSessionFactory().openSession()) {
//			// start a transaction
//			transaction = session.beginTransaction();
//			// update the student object
//			session.saveOrUpdate(order);
//			// commit transaction
//			transaction.commit();
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		}
//	}
//	public Orders getOrderById(int id) {
//		Transaction transaction = null;
//		Orders order=null;
//		try (Session session = Util.getSessionFactory().openSession()) {
//			// start a transaction
//			transaction = session.beginTransaction();
//			// get the student object byid
//			order=session.get(Orders.class, id);
////			order=session.load(Orders.class, id);
//			// commit transaction
//			transaction.commit();
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		}
//		return order;
//	}
//
//	public List<Orders> getOrders() {
//		try (Session session = Util.getSessionFactory().openSession()) {
//			return session.createQuery("from Student", Orders.class).list();
//		}
//	}
//}
