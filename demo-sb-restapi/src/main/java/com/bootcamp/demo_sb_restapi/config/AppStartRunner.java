package com.bootcamp.demo_sb_restapi.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
// @Autowired
// private CommandLineRunner commandLineRunner;
// if (commandLineRunner != null)
//    commandLineRunner.run();

@Component //Create a bean for AppStartRunner.class
public class AppStartRunner implements CommandLineRunner{
  // ! CommandLinerunner is used for something must be done before server starts
  @Override
	public void run(String... args) throws Exception {
    System.out.println("System Start");
  }
}
