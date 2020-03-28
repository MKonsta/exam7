package com.example.exam.controller;

import com.example.exam.model.Person;
import com.example.exam.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person addNew(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @DeleteMapping(path = "/del/{email}")
    public Person deleteByEmail(@PathVariable String email) {
        return personService.deleteByEmail(email);
    }

    @GetMapping(path = "/all")
    public List<Person> findAll() {
        return personService.findAll();
    }
}
