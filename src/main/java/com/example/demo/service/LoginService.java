package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;

//class with @Service will contains business logic to solve a problem
@Service
public class LoginService {
	
	UserRepository userRepository = new UserRepository();

	
	
	public boolean checkLogin(User user) {
		//logic 1
//		user = userRepository.getUser(user);
//		List<Order> list = orderRepository.getOrdersByUser(user);
//		if (user!= null && user.getForgotPasswordSecretString() != null && list.size() > 0) {
			return true;
//		} else {
//			return false;
//		}
		
		
		//logic 2
		
		//logic 3
		
		// + get Db data by calling functions in Repositories classes
	}

}
