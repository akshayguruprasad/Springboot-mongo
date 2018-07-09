package com.akshay.spring.springbootregisteration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.spring.springbootregisteration.dao.UserDao;
import com.akshay.spring.springbootregisteration.modal.User;
import com.akshay.spring.springbootregisteration.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Autowired
	UserRepository repository;
	
	
	@Override
	public User selectUserById(int id) {
User user=null;
try {
	
	repository.
	
	
	
	
} catch (Exception e) {
	// TODO: handle exception
}
return user;
		
	}

	@Override
	public User selectAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
