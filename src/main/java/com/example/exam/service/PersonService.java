package com.example.exam.service;

import com.example.exam.model.Person;
import com.example.exam.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public void deleteAll() {
        personRepository.deleteAll();
    }

    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
