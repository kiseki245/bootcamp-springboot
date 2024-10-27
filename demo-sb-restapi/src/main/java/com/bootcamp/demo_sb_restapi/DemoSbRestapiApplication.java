package com.bootcamp.demo_sb_restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSbRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbRestapiApplication.class, args);
	}
	
}
