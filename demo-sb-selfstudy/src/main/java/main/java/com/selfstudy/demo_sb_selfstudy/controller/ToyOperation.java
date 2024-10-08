package main.java.com.selfstudy.demo_sb_selfstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import main.java.com.selfstudy.demo_sb_selfstudy.model.Toy;

public interface ToyOperation {
  
  @GetMapping(value = ("/toy"))
  Toy getToy();

  @PutMapping(value = ("/setname/{name}"))
  String setName(@PathVariable String name);

  @PutMapping(value = ("/seprice/{price}"))
  int setPrice(@PathVariable int price);

  @GetMapping(value = ("/toy/getname"))
  String getName();

  @PutMapping(value = ("newtoy/{name}/{price}"))
  Toy createToy(@PathVariable String name, @PathVariable int price);
}
