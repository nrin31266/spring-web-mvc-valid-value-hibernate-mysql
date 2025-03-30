package com.rin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import com.rin.app.entity.User;
import com.rin.app.service.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("add")
	public String addUserPage(Model model) {
	    System.out.println("Get page add User");
	    model.addAttribute("user", new User());
	    return "users/add";
	}

	
	@PostMapping("add")
	public String addUser(@Valid @ModelAttribute("user") User user, 
	                      BindingResult bindingResult, Model model) throws Exception {
		System.out.println("Post add user");
		
	    if (bindingResult.hasErrors()) {
	        model.addAttribute("user", user); 
	        return "users/add"; 
	    }

	    System.out.println("Birthday received: " + user.getBirthday());
	    userService.saveUser(user);
	    return "redirect:/users";
	}

	
	@GetMapping
	public String getAllUser(Model model) {
		model.addAttribute("users", userService.getAll());
		return "users/index";
	}

	
}
