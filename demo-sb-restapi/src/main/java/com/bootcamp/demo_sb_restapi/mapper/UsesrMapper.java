package com.bootcamp.demo_sb_restapi.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;

@Component
public class UsesrMapper {
  
  public UserEnity map(User user) {
    return UserEnity.builder()
    .name(user.getName())
    .username(user.getUsername())
    .email(user.getEmail())
    .phone(user.getPhone())
    .website(user.getWebsite())
    .build();

  

  }
}
