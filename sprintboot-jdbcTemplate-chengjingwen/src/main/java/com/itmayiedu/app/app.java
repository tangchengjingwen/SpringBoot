package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.itmayiedu.service","com.itmayiedu.controller"})
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
