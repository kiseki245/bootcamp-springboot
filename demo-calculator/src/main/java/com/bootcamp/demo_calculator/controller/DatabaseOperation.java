package com.bootcamp.demo_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface DatabaseOperation {

  // Read Operation
  @GetMapping(value = "/database/strings/{index}")
  String getString(@PathVariable int index);

  // Write Operation (Create new resources)
  @PostMapping(value = "/database/strings/{newString}")
  String addString(@PathVariable String newString);

  @GetMapping(value = "/database/getvalue")
  String[] getValue();

  @GetMapping(value = "/database/size")
  int getSize();
}
