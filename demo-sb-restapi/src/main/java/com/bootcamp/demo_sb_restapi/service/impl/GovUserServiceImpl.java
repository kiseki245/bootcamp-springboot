package com.bootcamp.demo_sb_restapi.service.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.dto.GovUserDTO;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;
import com.bootcamp.demo_sb_restapi.mapper.GovMapper;
import com.bootcamp.demo_sb_restapi.repository.UserRepository;
import com.bootcamp.demo_sb_restapi.service.GovUserService;

public class GovUserServiceImpl implements GovUserService{
  @Autowired
  private UserRepository userRepository;  
  @Autowired
  private GovMapper govMapper;
  public GovUserDTO getUser(Long id){

   UserEnity target = userRepository.findById(id).get();
   return GovMapper.map(target);
    
  }
}
