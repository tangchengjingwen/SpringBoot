package com.itmayiedu.test01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmayiedu.test01.mapper.User1Mapper;

@Service
public class User01Service {
	@Autowired
	private User1Mapper user1Mapper;
	
	public int addUser(String name, Integer age) {
		return user1Mapper.addUser(name, age);
	}
}
