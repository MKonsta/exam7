package com.example.exam.service;

import com.example.exam.model.Order;
import com.example.exam.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order addOrder(Order order) {
        order.setDate(LocalDateTime.now());
        return orderRepository.save(order);
    }

    public void deleteAll() {
        orderRepository.deleteAll();
    }
}
