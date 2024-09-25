package com.selfstudy.demo_sb_selfstudy.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingBag {
  private List<Toy> toys;
  
}
