package com.example.peoplejarmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.peoplejarmongo.model.Person;

public interface PersonRepository extends MongoRepository<Person, String> {}
