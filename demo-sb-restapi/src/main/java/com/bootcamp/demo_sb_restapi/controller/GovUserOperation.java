package com.bootcamp.demo_sb_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.dto.GovUserDTO;

public interface GovUserOperation {

  
  @GetMapping(value = "/gov/db/users/{id}")
  GovUserDTO getUser(@PathVariable Long id);
}
