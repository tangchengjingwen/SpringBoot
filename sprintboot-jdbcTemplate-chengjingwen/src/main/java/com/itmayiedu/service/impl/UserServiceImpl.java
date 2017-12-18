package com.itmayiedu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.itmayiedu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createUser(String name, Integer age) {
		jdbcTemplate.update("insert into user values(?,?)",name, age);
		System.out.println("创造用户成功");
	}

}
