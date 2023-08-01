package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/users/{userId}/order")
    public Order getOrderByUser(@PathVariable(value = "userId") int userId) {
        return orderRepository.findByUserId(userId);
    }
}


