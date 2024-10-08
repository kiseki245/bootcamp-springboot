package com.bootcamp.demo_calculator.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import com.bootcamp.demo_calculator.DemoCalculatorApplication;

@Service
public class BeanService {
  
  public List<String> getBeans(){
    return Arrays.stream(DemoCalculatorApplication.context.getBeanDefinitionNames())
    .collect(Collectors.toList());
  }
}
