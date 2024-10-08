package main.java.com.selfstudy.demo_sb_selfstudy.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import main.java.com.selfstudy.demo_sb_selfstudy.controller.ToyOperation;
import main.java.com.selfstudy.demo_sb_selfstudy.model.Toy;

@Controller
@ResponseBody
public class ToyController implements ToyOperation{
  @Autowired
  private Toy toy;

  @Override
  public Toy getToy(){
    return this.toy;
  }
  @Override
  public String setName(String name){
     this.toy.setName(name);
     return this.toy.getName();
  }
  @Override
  public int setPrice(int price){
    this.toy.setPrice(price);
    return this.toy.getPrice();
  }

  @Override
  public String getName(){
    return this.toy.getName();
  }

  @Override
  public Toy createToy(String name, int price){
    return new Toy(name, price);
    
  }
}
