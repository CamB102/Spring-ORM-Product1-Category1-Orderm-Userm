package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;
import com.example.demo.model.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	//order is a reserved key word in SQL
	
	@Query("SELECT ord FROM Order ord LEFT JOIN ord.user u WHERE u.id = :userId")
    Order findByUserId(@Param("userId") int userId);

}

