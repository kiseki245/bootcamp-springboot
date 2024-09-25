package com.selfstudy.demo_sb_selfstudy.controller.impl;


import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.selfstudy.demo_sb_selfstudy.controller.ToyOperation;
import com.selfstudy.demo_sb_selfstudy.model.Dimension;
import com.selfstudy.demo_sb_selfstudy.model.ShoppingBag;
import com.selfstudy.demo_sb_selfstudy.model.Toy;

@Controller
@ResponseBody
public class ToyController implements ToyOperation{
  
  // public Toy getToy(String name, int price){
  //   return new Toy(name, price);
  // }

  public List<Toy> getToyList(){
    System.out.println("Toy list generated");
    return List.of(new Toy("Gundam", 229, true, new Dimension(15, 24.3, 13.5)),
    new Toy("Robot", 333, false, new Dimension(115, 23, 123.3)),
    new Toy("Doll", 13, false, new Dimension(13, 2, 3.4))
    );
  }

  public Toy getFullToy(String name, int price,boolean isexclusive, Dimension dimension){
    return new Toy("Gundam", 229, true, new Dimension(15, 24.3, 13.5));
  }

  public ShoppingBag getShoppingBag(){
    ShoppingBag s1 = new ShoppingBag(List.of(new Toy("Gundam", 229, true, new Dimension(15, 24.3, 13.5)),
    new Toy("Robot", 333, false, new Dimension(115, 23, 123.3)),
    new Toy("Doll", 13, false, new Dimension(13, 2, 3.4))
    ));
    ShoppingBag s2 = new ShoppingBag(List.of(new Toy("Gundam", 229, true, new Dimension(15, 24.3, 13.5)),
    new Toy("Robot", 333, false, new Dimension(115, 23, 123.3)),
    new Toy("Doll", 13, false, new Dimension(13, 2, 3.4))
    ));

    return s1;
  }
}
