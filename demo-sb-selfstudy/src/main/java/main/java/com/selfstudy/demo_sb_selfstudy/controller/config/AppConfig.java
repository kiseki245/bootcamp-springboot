package main.java.com.selfstudy.demo_sb_selfstudy.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import main.java.com.selfstudy.demo_sb_selfstudy.model.Toy;

@Configuration
public class AppConfig {
  
  @Bean(name = "Robot")
  Toy createToy(){
    return new Toy("Robot", 100);
  }

}
