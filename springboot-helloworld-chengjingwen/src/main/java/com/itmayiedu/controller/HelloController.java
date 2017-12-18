package com.itmayiedu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/index")
	public String index() {
		int i = 1/0;
		return "hello 迪丽热巴";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloController.class, args);
	}
}
