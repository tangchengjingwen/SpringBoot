package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.itmayiedu.controller")
@EnableAutoConfiguration
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
