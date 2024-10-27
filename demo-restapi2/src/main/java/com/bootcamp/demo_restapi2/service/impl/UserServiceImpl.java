package com.bootcamp.demo_restapi2.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.infra.ApiUtil;
import com.bootcamp.demo_restapi2.infra.Scheme;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.repository.UserRepository;
import com.bootcamp.demo_restapi2.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  @Value("${api.endpoint.users}")
  private String endpoint;
  @Autowired
  private ApiUtil apiUtil;
  @Autowired
  private RestTemplate restTemplate;
  @Autowired
  private UserRepository userRepository;

  public User[] getUsers(){
    System.out.println(Scheme.HTTP.toString() + endpoint);
    User[] users = new RestTemplate().getForObject(apiUtil.getUrl(Scheme.HTTPS, endpoint), User[].class);
    if(userRepository.findAll().size() == 0){
    for(User user : users){
      userRepository.save(UserEntity.builder()
      .name(user.getName())
      .username(user.getUsername())
      .email(user.getEmail())
      .phone(user.getPhone())
      .website(user.getWebsite())
      .build()
      );

    }
  } else {
    System.out.println("Data already exist");
  }
    return users;
  }

  public User getUser(Long id){
    List<User> userlist = List.of(getUsers());
    return userlist.stream().filter(user -> 
    user.getId().equals(Integer.valueOf(id.toString()))).findFirst().get();
  }
  
  public UserEntity createUser(String name, String username, String email, String phone, String website){
    return null;
  }

  public Optional<UserEntity> getUserFromDB(Long id){
    return this.userRepository.findById(id);
  }
}
