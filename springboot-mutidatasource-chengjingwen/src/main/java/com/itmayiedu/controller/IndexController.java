package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.test01.service.User01Service;
import com.itmayiedu.test02.service.User02Service;

@RestController
@EnableAutoConfiguration
//@SpringBootApplication
public class IndexController {
	@Autowired
	private User01Service user01Service;
	@Autowired
	private User02Service user02Service;
	
	@RequestMapping("/add")
	public String add() {
		
		user01Service.addUser("唐成靖文❤", 22);
		user02Service.addUser("迪丽热巴❤", 25);
		return "success添加成功";
	}
	
//	public static void main(String[] args) {
//		SpringApplication.run(IndexController.class, args);
//	}
	
}
