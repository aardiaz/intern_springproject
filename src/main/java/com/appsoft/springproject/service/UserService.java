package com.appsoft.springproject.service;

import com.appsoft.springproject.model.User;

public interface UserService {
	
	void userSignup(User user);
	User  userLogin(String un, String psw);
}
