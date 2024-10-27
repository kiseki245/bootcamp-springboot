package com.bootcamp.demo_sb_restapi.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_sb_restapi.bootcamp.urlmanager;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;
import com.bootcamp.demo_sb_restapi.exception.BusinessException;
import com.bootcamp.demo_sb_restapi.mapper.UsesrMapper;
import com.bootcamp.demo_sb_restapi.repository.UserRepository;
import com.bootcamp.demo_sb_restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{

  // private static final String url = "https://jsonplaceholder.typicode.com/users";
  @Value("${api.url.domain}") // @Value before @Service bean created, Spring find "api.url" value from application.yml
  private String domain;

  @Value("${api.url.userEndpoint}") // @Value before @Service bean created, Spring find "api.url" value from application.yml
  private String endpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private UsesrMapper mapper;
  @Autowired
  private UserRepository userRepository;
  @Override
  public User[] getUsers() {
    // call API from "jsonp
    // We receive user array"
    String url = urlmanager.builder()
    .domain(this.domain)
    .endpoint(this.endpoint)
    .build().toString();

    User[] users = new RestTemplate().getForObject(url, User[].class);
    
    System.out.println(Arrays.toString(users));
    
    if (userRepository.findAll().size() == 0){
      System.out.println("Table created");
      Arrays.asList(users).stream() // Save the user into database
      .forEach(user -> {
        UserEnity userEnity = mapper.map(user);
        userRepository.save(userEnity);
      });
    } else {
      System.out.println("Already have data!");
    }
    return new RestTemplate().getForObject(url, User[].class);
  }

  public User getUser(Long userID){
    return Arrays.stream(this.getUsers())
    .filter(user -> user.getId().equals(Integer.valueOf(userID.toString())))
    .findFirst().get();
  }

  public UserEnity createNewUser(String name ,String phone, String eail){
    return userRepository.save(UserEnity.builder()
    .name(name)
    .email(eail)
    .phone(phone)
    .build()
    );
  }
  @Override
  public UserEnity getUserFromDB(Long id){
    return this.userRepository.findById(id).orElse(null);
  }

  // Controller -> 
  @Override
  public void deleteUser(Long id){
    if (!this.userRepository.existsById(id))
      throw new BusinessException(1, "User ID not found");
    this.userRepository.deleteById(id);
  }

}
