package com.example.jdbcdemo.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.example.jdbcdemo.domain.Person;

public class PersonManagerTest {
	
	
	PersonManagerJDBC personManager = new PersonManagerJDBC();
	
	private final static String NAME_1 = "Zenek";
	private final static int YOB_1 = 1945;
	
	private final static String NAME_2 = "Ziutek";
	private final static int YOB_2 = 1945;
	
	private final static String NAME_3 = "Bolek";
	private final static int YOB_3 = 1945;
	
	private final static String NAME_4 = "Lolek";
	private final static int YOB_4 = 1945;
		
	Person person1 = new Person(NAME_1, YOB_1);
	Person person2 = new Person(NAME_2, YOB_2);
	Person person3 = new Person(NAME_3, YOB_3);
	Person person4 = new Person(NAME_4, YOB_4);
	
	@Test
	public void checkConnection(){
		assertNotNull(personManager.getConnection());
	}
	
	//@Test
	public void checkAdding(){
		
		Person person = new Person(NAME_1, YOB_1);
		
		personManager.clearPersons();
		assertEquals(1,personManager.addPerson(person));
		
		List<Person> persons = personManager.getAllPersons();
		Person personRetrieved = persons.get(0);
		
		assertEquals(NAME_1, personRetrieved.getName());
		assertEquals(YOB_1, personRetrieved.getYob());
		
	}
	
	@Test
	public void checkAddAll(){
		personManager.clearPersons();		
		
		List<Person> persons = new ArrayList<>();
		persons.add(person1);
		persons.add(person2);
		//persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		
		personManager.addAllPersons(persons);
		int size = personManager.getAllPersons().size();
		
		//assertTrue(size == 0 || size == 4);
		
		assertThat(size, either(is(4)).or(is(0)));
		
	}

}
