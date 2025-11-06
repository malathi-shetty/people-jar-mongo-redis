package com.example.peoplejarmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PeopleJarMongoApplication {
    public static void main(String[] args) {
        SpringApplication.run(PeopleJarMongoApplication.class, args);
    }
}
