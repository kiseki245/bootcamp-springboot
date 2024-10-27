package com.bootcamp.demo_restapi2.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.model.User;

@Component
public class UserMapper {
  public UserEntity map(User user){
    return UserEntity.builder()
    .name(user.getName())
    .username(user.getUsername())
    .email(user.getEmail())
    .phone(user.getPhone())
    .website(user.getWebsite())
    .build();
  }

  public User map(UserEntity userEntity){
    return User.builder()
    .name(userEntity.getName())
    .username(userEntity.getUsername())
    .email(userEntity.getEmail())
    .phone(userEntity.getPhone())
    .website(userEntity.getWebsite())
    .build();
  }
}
