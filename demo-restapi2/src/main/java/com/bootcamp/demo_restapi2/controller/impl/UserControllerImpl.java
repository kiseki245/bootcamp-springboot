package com.bootcamp.demo_restapi2.controller.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_restapi2.controller.UserController;
import com.bootcamp.demo_restapi2.mapper.UserMapper;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.model.UserRequest;
import com.bootcamp.demo_restapi2.repository.UserRepository;
import com.bootcamp.demo_restapi2.service.UserService;

@RestController
public class UserControllerImpl implements UserController{
  
  @Autowired
  private UserService userService;

  @Autowired
  private UserMapper userMapper;

  public List<User> getUsers(){
    
    return Arrays.asList(userService.getUsers());
  }

  public User getUser(Long userId){
    return userService.getUser(Long.valueOf(userId));
  }

  public User createUser(UserRequest userRequest){
    String name = userRequest.getName();
    String username = userRequest.getUsername();
    String phone = userRequest.getPhone();
    String email = userRequest.getEmail();
    String website = userRequest.getWebsite();
    return userMapper.map(userService.createUser(name, username, email, phone, website));
  }

  public User updateUser(Long userId, UserRequest userRequest){
    return userService.updateUser(userId, userRequest);
  }
}
