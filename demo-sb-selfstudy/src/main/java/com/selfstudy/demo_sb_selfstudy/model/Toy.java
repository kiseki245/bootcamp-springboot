package com.selfstudy.demo_sb_selfstudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Toy {
  private String name;
  private int price;
  private boolean marketExclusive;
  private Dimension dimension;

  public Toy(String name, int price, Dimension dimension){
    this.name = name;
    this.price = price;
    this.dimension = dimension;
  }
}
