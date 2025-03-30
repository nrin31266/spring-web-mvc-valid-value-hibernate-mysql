package com.rin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rin.app.service.HelloService;


@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@GetMapping
	public String hello(Model model) {
		model.addAttribute("User", helloService.hello());
	
		return "hello";
	}
	

}
