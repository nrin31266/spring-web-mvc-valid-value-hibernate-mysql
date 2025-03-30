package com.rin.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.rin.app.entity.User;
import com.rin.app.repository.UserRepository;




@Service
public class UserService { 
	
    
	@Autowired
	UserRepository userRepository;
	

	@Transactional
	public void saveUser(User user)  {
		userRepository.save(user);
		throw new RuntimeException("test transactional");
	}
	

	public List<User> getAll(){
		return userRepository.findAll();
	}
}
