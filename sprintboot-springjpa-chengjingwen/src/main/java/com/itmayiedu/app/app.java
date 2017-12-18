package com.itmayiedu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan("com.itmayiedu")
@EnableJpaRepositories("com.itmayiedu.Dao")
@EntityScan("com.itmayiedu.entity")
public class app {
	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
}
