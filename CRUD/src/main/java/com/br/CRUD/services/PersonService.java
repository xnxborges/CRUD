package com.br.CRUD.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.br.CRUD.model.Person;

@Repository
@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	// Mock estático
	public Person findbyId(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Natan");
		person.setLastName("Borges");
		person.setAdress("Cotia-São Paulo-Brasil");
		person.setGender("Male");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons;

	}

	// mock Dinâmico
	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Person name" + i);
		person.setLastName("Last name" + i);
		person.setAdress("Some adress in Brazil" + i);
		person.setGender("Male");
		return person;
	}

}
