package com.bootcamp.demo_sb_restapi.controller.impl;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_sb_restapi.controller.UserOperation;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.controller.model.UserRequest;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;
import com.bootcamp.demo_sb_restapi.exception.BusinessException;
import com.bootcamp.demo_sb_restapi.mapper.UsesrMapper;
import com.bootcamp.demo_sb_restapi.service.UserService;

@RestController
public class UserController implements UserOperation{
  
  @Autowired
  private UserService userService;

  @Autowired
  private UsesrMapper usesrMapper;
  @Override
  public User[] getUsers(){
    return userService.getUsers();
  }

  @Override
  public User getUser(String userID){
      return userService.getUser(Long.parseLong(userID));
  }

  @Override
  public User createNewUser(UserRequest userForm){
    String name = userForm.getName();
    String email = userForm.getEmail();
    String phone = userForm.getPhone();

    return usesrMapper.map(userService.createNewUser(name, email, phone));
  }
  @Override
  public UserEnity getUserFromDB(Long id){
    
    return userService.getUserFromDB(id);
  }

  @Override
  public void deleteUser(Long id){
      this.userService.deleteUser(id);
  }
}
