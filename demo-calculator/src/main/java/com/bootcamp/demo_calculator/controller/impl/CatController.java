package com.bootcamp.demo_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo_calculator.controller.CatOperation;
import com.bootcamp.demo_calculator.model.Cat;

@Controller
@ResponseBody
public class CatController implements CatOperation{
  
@Autowired
@Qualifier(value = "Peter")
private Cat cat; // object address -> spring context's cat object
@Override
public String getCatName(){
  return this.cat.getName();
  }
  @Override
  public Cat updateCatname(String name){
    this.cat.setName(name);
    return this.cat;
  }
}
