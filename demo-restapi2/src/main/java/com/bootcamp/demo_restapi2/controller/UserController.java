package com.bootcamp.demo_restapi2.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.model.UserDTO;

public interface UserController {

  @GetMapping(value = "/getusers")
  List<User> getUsers();

  @GetMapping(value = "/getuser/{userId}")
  User getUser(@PathVariable Long userId);

  @PostMapping(value = "/createuser")
  User createUser(@RequestBody UserDTO userDTO);
  



}
