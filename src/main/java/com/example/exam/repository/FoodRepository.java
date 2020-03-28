package com.example.exam.repository;

import com.example.exam.model.Food;
import com.example.exam.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FoodRepository extends MongoRepository<Food, String> {

    List<Food> findAll();


}
