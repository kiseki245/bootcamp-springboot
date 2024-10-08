package com.bootcamp.demo_calculator.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo_calculator.controller.BeanOperation;
import com.bootcamp.demo_calculator.service.BeanService;

@Controller
@ResponseBody
public class BeanController implements BeanOperation{
  
  @Autowired
  private BeanService bs;
  @Override
  public List<String> getBeans(){
    return bs.getBeans();
  }
}
