package com.bhavna.service;

import com.bhavna.bean.Person;

public interface Service {
	public boolean addPerson(Person p);

	public boolean deletePerson(int id);

	public Person getPerson(int id);

	public Person[] getAllPersons();
}
