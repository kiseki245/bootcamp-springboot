package com.bootcamp.demo_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// 1. @SpringBootConfiguration
// 2. @EnableAutoConfiguration
// 3. @ComponentScan
// What is Bean ?
// - The object lifecycle is managed by somene, but not you.
// - In Spring, most of the beans are created during server start
// What is Component? 
// - e.g @Controller -> annocation -> before server start completed, new BookController
// - A clas that used to create bean, we call it Component
// - When server starts, scan the whole spring project, to find my class with componet annotaion
// - Component anootation: @Controller, @Service, @Configuration, @Repostitory
public class DemoCalculatorApplication {

	public static ConfigurableApplicationContext context; //Spring context
	public static void main(String[] args) {
		// String s = "abc"; // Strings object (heap memory)
		// static method
		DemoCalculatorApplication.context = 
		SpringApplication.run(DemoCalculatorApplication.class, args);

	}


	// Spring Boot Application
	// 1. main code compile OK
	// 2. Server Starts -> Component Scan, Create Component, Prepare SpringContext
	// 3. Runtime -> Client (browser) able to call the server

	// Spring = DI (Dependency Injection) + IOC (Inverse of Control)
}
