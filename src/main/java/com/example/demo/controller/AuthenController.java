package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.LoginService;

@RestController
public class AuthenController {
	
	//dependency injection from spring pool to AuthenController
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody User user) {
		return loginService.checkLogin(user);
	}

}
