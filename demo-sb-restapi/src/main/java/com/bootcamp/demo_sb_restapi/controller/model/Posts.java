package com.bootcamp.demo_sb_restapi.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Posts {
  
  private Long userId;
  private Long id;
  private String title;
  private String body;
}
