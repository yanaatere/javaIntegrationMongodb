package com.learn.mongodb;

import com.learn.mongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbApplication {

    @Autowired
    ItemRepository groceryItemRepo;


    public static void main(String[] args) {

        SpringApplication.run(MongodbApplication.class, args);
    }
}
