package com.bootcamp.demo_sb_restapi.service;

import java.util.List;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;

public interface UserService {

  User[] getUsers();

  User getUser(Long userIDß);

  UserEnity createNewUser(String name, String email, String phone);
/**
 * Get user data from database
 * @return
 */
  UserEnity getUserFromDB(Long id);

  void deleteUser(Long id);
  
}
