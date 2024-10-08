package main.java.com.selfstudy.demo_sb_selfstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import main.java.com.selfstudy.demo_sb_selfstudy.model.Toy;

public interface ToyDBOperation {
  
  @PutMapping(value = "/toydbP{name}/{price}")
  Toy addToy(@PathVariable String name, @PathVariable int price);

}
