package com.bootcamp.demo_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 1. @SpringBootConfiguration
// 2. @EnableAutoConfiguration
// 3. @ComponentScan
// What is Bean ?
// - The object lifecycle is managed by somene, but not you.
// - In Spring, most of the beans are created during server start
// What is Component?
public class DemoCalculatorApplication {

	public static void main(String[] args) {
		String s = "abc"; // Strings object (heap memory)
		// static method
		SpringApplication.run(DemoCalculatorApplication.class, args);
	}

}
