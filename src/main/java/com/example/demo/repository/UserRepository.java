package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;


//only class that has @Repository can access and get data from data base
@Repository
public class UserRepository {
	public User getUser(User user) {
		//check if user.passwork + user.name exist in db;
		return user;
	}
}
