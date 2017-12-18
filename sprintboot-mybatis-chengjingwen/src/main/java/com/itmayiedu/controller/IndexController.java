package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.mapper.UserMapper;

@RestController
public class IndexController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/addUser")
	public String addUser() {
		userMapper.insert("唐成靖文", 22);
		return "添加用户success";
	}
	

}
