package com.appsoft.springproject.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.springproject.model.User;
import com.appsoft.springproject.repository.UserRepository;
import com.appsoft.springproject.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userReop;

	@Override
	public void userSignup(User user) {
		
		userReop.save(user);
	}

	@Override
	public User userLogin(String un, String psw) {
		
		return userReop.findByUsernameAndPassword(un, psw);
	}

}
