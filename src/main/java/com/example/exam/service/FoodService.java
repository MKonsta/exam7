package com.example.exam.service;

import com.example.exam.model.Food;
import com.example.exam.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteAll() {
        foodRepository.deleteAll();
    }

    public List<Food> getAll() {
        return foodRepository.findAll();
    }
}
