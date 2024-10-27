package com.bootcamp.demo_sb_restapi.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_sb_restapi.controller.GovUserOperation;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.dto.GovUserDTO;
import com.bootcamp.demo_sb_restapi.service.GovUserService;

@RestController
public class GovUserController implements GovUserOperation{
  @Autowired
  private GovUserService govUserService;
  
  public GovUserDTO getUser(Long id){
    return govUserService.getUser(id);
  }
}
