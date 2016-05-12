package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example")
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}
}
