package com.example.peoplejarmongo;

import com.example.peoplejarmongo.model.Person;
import com.example.peoplejarmongo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Testcontainers
public class PersonRepositoryTest {

    @Container
    static MongoDBContainer mongo = new MongoDBContainer("mongo:6.0");

    @Autowired
    PersonRepository repo;

    @Test
    public void saveAndFind() {
        repo.deleteAll();
        Person p = new Person("A","B","a@b.com");
        repo.save(p);
        List<Person> all = repo.findAll();
        assertThat(all).isNotEmpty();
        assertThat(all.get(0).getEmail()).isEqualTo("a@b.com");
    }
}
