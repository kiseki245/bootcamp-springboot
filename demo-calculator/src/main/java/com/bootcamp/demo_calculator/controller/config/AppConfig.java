package com.bootcamp.demo_calculator.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.demo_calculator.model.Cat;

@Configuration // Components
public class AppConfig {
  // !@Configuration + @Bean

  @Bean(name = "John")
  Cat createCat(){
  return new Cat("John");
  }
  @Bean (name = "Peter")
  Cat createCat2(){
    return new Cat("Peter");
  }
}
