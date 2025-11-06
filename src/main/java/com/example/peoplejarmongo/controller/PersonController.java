package com.example.peoplejarmongo.controller;

import com.example.peoplejarmongo.model.Person;
import com.example.peoplejarmongo.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;

@RestController
public class PersonController {

    private final PersonRepository repo;

    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/person/create")
    public ResponseEntity<Person> create(@RequestParam String given,
                                         @RequestParam String family,
                                         @RequestParam String email) {
        Person p = repo.save(new Person(given, family, email));
        return ResponseEntity.ok(p);
    }

    @GetMapping("/api/persons")
    @Cacheable("persons")
    public List<Person> list() {
        return repo.findAll();
    }
}
