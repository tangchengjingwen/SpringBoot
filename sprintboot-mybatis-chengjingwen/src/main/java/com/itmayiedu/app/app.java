package com.itmayiedu.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.itmayiedu.controller"})
@MapperScan("com.itmayiedu.mapper")
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
