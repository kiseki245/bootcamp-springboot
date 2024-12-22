package com.bootcamp.demo_restapi2.service;

import java.util.Optional;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.model.UserRequest;

public interface UserService {
  
  User[] getUsers();

  User getUser(Long userId);

  UserEntity createUser(String name, String username, String email, String phone, String website);

  Optional<UserEntity> getUserFromDB(Long id);

  User updateUser(Long userId, UserRequest userRequest);
}
