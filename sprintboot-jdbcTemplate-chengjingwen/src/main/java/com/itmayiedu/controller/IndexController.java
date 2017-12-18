package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.UserService;

@RestController
public class IndexController {
	@Autowired
	private UserService userService;
	@RequestMapping("/insert")
	public String insert(String name, Integer age) {
		userService.createUser(name, age);
		return "success!!!!!!!";
	}
}
