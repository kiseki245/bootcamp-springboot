package com.bootcamp.demo_sb_restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
  
  @Bean
  RestTemplate restTemplate(){
    return new RestTemplate();
  }

}
