package com.bootcamp.demo_restapi2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.bootcamp.demo_restapi2.dto.GovUserDTO;
import com.bootcamp.demo_restapi2.exception.GeneralResponse;

public interface GovUserController {
  
  @GetMapping(value = "/gov/db/user/{id}")
  GeneralResponse<GovUserDTO> getUserFromDBByid(@PathVariable Long id);
}
