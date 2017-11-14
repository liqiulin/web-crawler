package com.thzj.webcrawler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.thzj.webcrawler.repository")
@MapperScan("com.thzj.webcrawler.dao")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
