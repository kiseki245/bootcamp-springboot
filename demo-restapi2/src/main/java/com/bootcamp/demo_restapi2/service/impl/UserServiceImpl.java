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
import com.bootcamp.demo_restapi2.exception.CustomException;
import com.bootcamp.demo_restapi2.exception.ErrorCode;
import com.bootcamp.demo_restapi2.infra.ApiUtil;
import com.bootcamp.demo_restapi2.infra.Scheme;
import com.bootcamp.demo_restapi2.model.User;
import com.bootcamp.demo_restapi2.model.UserRequest;
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
    return users;
  }

  public User getUser(Long id){
    List<User> userlist = List.of(getUsers());
    return userlist.stream().filter(user -> 
    user.getId().equals(Integer.valueOf(id.toString()))).findFirst().get();
  }
  
  public UserEntity createUser(String name, String username, String email, String phone, String website){
    List<UserEntity> users = userRepository.findAll();
    for (UserEntity userEntity : users) {
      if(userEntity.getPhone().equals(phone))
          throw new CustomException(ErrorCode.USER_ALREADY_EXIST);
    }
    return userRepository.save(UserEntity.builder()
    .name(name)
    .username(username)
    .email(email)
    .phone(phone)
    .website(website)
    .build()
    );
  }

  public Optional<UserEntity> getUserFromDB(Long id){
    return this.userRepository.findById(id);
  }

  public User updateUser(Long userId, UserRequest userRequest){
    Optional<UserEntity> targetUser = userRepository.findById(Long.valueOf(userId));

    if(targetUser.isPresent()){
      targetUser.get().setName(userRequest.getName());
      targetUser.get().setUsername(userRequest.getUsername());
      targetUser.get().setEmail(userRequest.getEmail());
      targetUser.get().setPhone(userRequest.getPhone());
      targetUser.get().setWebsite(userRequest.getWebsite());
      userRepository.save(targetUser.get());
    }
    throw new CustomException(ErrorCode.USER_ID_NOT_EXIST);
  }

}
