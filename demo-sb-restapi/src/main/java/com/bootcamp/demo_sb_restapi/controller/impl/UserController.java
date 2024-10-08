package com.bootcamp.demo_sb_restapi.controller.impl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_sb_restapi.controller.UserOperation;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.service.UserService;

@RestController
public class UserController implements UserOperation{
  
  @Autowired
  private UserService userService;

  @Override
  public User[] getUsers(){
    return userService.getUsers();
  }

  @Override
  public User getUser(String userID){
      return userService.getUser(Long.parseLong(userID));
  }
}
