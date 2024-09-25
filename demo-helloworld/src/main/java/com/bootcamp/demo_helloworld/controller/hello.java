package com.bootcamp.demo_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class hello {
  // !!! Java Object-gretting()
  @GetMapping(value = "/v1/hello")
  public String greeting(){
    System.out.println("This is logging");
    return "HELLO";
  }

  @GetMapping(value = "/v1/goodbye") // path cannot be duplicated
  public String goodbye(){
    System.out.println("Good bye logging");
    return "Good Bye";
  }
}
