package br.com.CRUD.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.br.CRUD.model.Person;

@Repository
@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	public Person findbyId(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFistName("Natan");
		person.setLastName("Borges");
		person.setAdress("Cotia-São Paulo-Brasil");
		person.setGender("Male");
		return person;
	}

}
