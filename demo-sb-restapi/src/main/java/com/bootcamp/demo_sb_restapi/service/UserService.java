package com.bootcamp.demo_sb_restapi.service;

import com.bootcamp.demo_sb_restapi.controller.model.User;

public interface UserService {

  User[] getUsers();

  User getUser(Long userIDß);
}
