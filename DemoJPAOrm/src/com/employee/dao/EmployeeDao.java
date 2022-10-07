package com.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.employee.entity.EmployeeEntity;

public class EmployeeDao {
	public  void addData() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        System.out.println("Connection Establish");
       EmployeeEntity emp = new EmployeeEntity(102, "sham", 90000);
       em.getTransaction().begin();
        em.persist(emp);
      
       em.getTransaction().commit();
        System.out.println("Record Inserted");
        entityManagerFactory.close();
        em.close();
	}
	public void updateEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        EmployeeEntity emp = new EmployeeEntity(101, "Tam", 30000);
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
        System.out.println("Record Updated");
        em.close();
    }
	public void deleteEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        EmployeeEntity emp = em.find(EmployeeEntity.class, 102);
        if(emp != null) {
            em.remove(emp);
            System.out.println("Record Removed");
        } else {
            System.out.println("No record Found");
        }
        em.getTransaction().commit();
        em.close();
    }
	public void getEmployee() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit1");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        EmployeeEntity emp = em.find(EmployeeEntity.class, 102);
        if(emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("No record Found");
        }
        em.getTransaction().commit();
        em.close();
    }
	
}
