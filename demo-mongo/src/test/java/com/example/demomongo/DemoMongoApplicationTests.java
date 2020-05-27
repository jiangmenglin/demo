package com.example.demomongo;

import com.example.demomongo.entity.Person;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class DemoMongoApplicationTests {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testMongodb() {
        mongoTemplate.dropCollection("human");
        mongoTemplate.createCollection("human");
        Person p = new Person("Joe", 34);

        // Insert is used to initially store the object into the database.
        mongoTemplate.insert(p);
        Object person = mongoTemplate.findAll(Person.class);
        System.out.println(new Gson().toJson(person));
    }

    @Test
    void contextLoads() {
    }

}
