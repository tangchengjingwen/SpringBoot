package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = { "com.itmayiedu.app", "com.itmayiedu.controller", "com.itmayiedu.test01",
		"com.itmayiedu.test02", "com.itmayiedu.datasource" })
//@EnableCaching  //开启缓存注解
//@EnableScheduling//开启定时任务注解
@EnableAutoConfiguration
@SpringApplicationConfiguration
//@EnableAsync
//@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
