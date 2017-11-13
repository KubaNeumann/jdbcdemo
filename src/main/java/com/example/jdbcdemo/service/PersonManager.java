package com.example.jdbcdemo.service;

import java.util.List;

import com.example.jdbcdemo.domain.Person;

public interface PersonManager {
	
	public int addPerson(Person person);
	public List<Person> getAllPersons();
	
	/* batch insert - transactional */
	public void addAllPersons(List<Person> persons);

}
