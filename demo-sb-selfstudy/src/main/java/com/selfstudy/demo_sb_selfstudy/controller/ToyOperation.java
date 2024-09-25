package com.selfstudy.demo_sb_selfstudy.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.selfstudy.demo_sb_selfstudy.model.Dimension;
import com.selfstudy.demo_sb_selfstudy.model.ShoppingBag;
import com.selfstudy.demo_sb_selfstudy.model.Toy;

public interface ToyOperation {
  

  // @GetMapping(value = "/toy/isexclusive/{name}/{price}")
  // public Toy getToy(@PathVariable String name, @PathVariable int price, @PathVariable boolean isexclusive);
  
  // @GetMapping(value = "/toy/{name}/{price}")
  // public Toy getToy(@PathVariable String name,@PathVariable int price);

  @GetMapping(value = "/toy/toylist")
  public List<Toy> getToyList();

  @GetMapping(value = "/toy/{name}/{price}/{isexclusive}/{dimension}")
  public Toy getFullToy(@PathVariable String name, @PathVariable int price,
  @PathVariable boolean isexclusive, @PathVariable Dimension dimension);

  @GetMapping(value = "/shoppingbag")
  public ShoppingBag getShoppingBag();
}
