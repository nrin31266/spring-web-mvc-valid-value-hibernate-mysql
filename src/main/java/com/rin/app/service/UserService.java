package com.rin.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rin.app.dto.CreateUserRequest;
import com.rin.app.entity.User;
import com.rin.app.mapper.UserMapper;
import com.rin.app.repository.UserRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;




@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService { 
	
    
	
	UserRepository userRepository;
	
	UserMapper userMapper;
	

	@Transactional
	public void saveUser(CreateUserRequest requestBody)  {
		User user = userMapper.toUser(requestBody);
//		user.setGender(requestBody.getGender());
//		user.setBirthday(requestBody.getBirthday());
//		user.setName(requestBody.getName());
		
		userRepository.save(user);
		
	}
	

	public List<User> getAll(){
		return userRepository.findAll();
	}
}
