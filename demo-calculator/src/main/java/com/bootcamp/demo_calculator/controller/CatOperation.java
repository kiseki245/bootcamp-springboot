package com.bootcamp.demo_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.bootcamp.demo_calculator.model.Cat;

public interface CatOperation {
  
  @GetMapping(value = "/cat")
  String getCatName();

  @PutMapping(value = "/cat/{newName}")
  Cat updateCatname(@PathVariable String newName);

}
