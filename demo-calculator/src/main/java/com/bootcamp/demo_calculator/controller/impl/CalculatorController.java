package com.bootcamp.demo_calculator.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController {
  

  @GetMapping(value = "/v1/sum/{x}/{y}")
  public int sum(@PathVariable int x,@PathVariable int y){
    System.out.println("sum() triggered, x is:" + x + "y is:" + y);

    return x + y;
  }

  @GetMapping(value = "/v1/substract/{x}/{y}")
  public String substract(@PathVariable String x,@PathVariable String y){
    System.out.println("subtract() triggered, x is:" + x + "y is:" + y);
    try {
     return String.valueOf(Long.parseLong(x) - Long.parseLong(y));
    } catch (NumberFormatException e){
      System.out.println("Input invalid");
    return "The input number parmes is invalid";
    }
  }

  @GetMapping(value = "/v1/multiply/{x}/{y}")
  public int multiply(@PathVariable int x,@PathVariable int y){
    System.out.println("myltiply() triggered, x is:" + x + "y is:" + y);

    return x * y;
  }

  @GetMapping(value = "/v1/divide/{x}/{y}")
  public String divide(@PathVariable int x,@PathVariable int y){
    System.out.println("divide() triggered, x is:" + x + "y is:" + y);
    try {
     return String.valueOf(x / y);
    } catch (ArithmeticException e) {
      return (x + " cannot divide with " + y);
    }
  }
}
