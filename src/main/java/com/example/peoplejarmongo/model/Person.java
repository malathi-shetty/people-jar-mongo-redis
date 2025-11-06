package com.example.peoplejarmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
public class Person {
    @Id
    private String id;
    private String given;
    private String family;
    private String email;

    public Person() {}
    public Person(String given, String family, String email) {
        this.given = given; this.family = family; this.email = email;
    }
    public String getId() { return id; }
    public String getGiven() { return given; }
    public String getFamily() { return family; }
    public String getEmail() { return email; }
    public void setId(String id) { this.id = id; }
    public void setGiven(String given) { this.given = given; }
    public void setFamily(String family) { this.family = family; }
    public void setEmail(String email) { this.email = email; }
}
