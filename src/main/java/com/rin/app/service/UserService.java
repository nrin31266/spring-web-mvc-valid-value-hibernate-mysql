package com.rin.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rin.app.dao.UserDao;
import com.rin.app.entity.User;



@Service
public class UserService {
	
    
	@Autowired
	UserDao userDao;
	
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}
	
	@Transactional
	public List<User> getAll(){
		return userDao.getAllUser();
	}
}
