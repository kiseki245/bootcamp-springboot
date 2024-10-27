package com.bootcamp.demo_sb_restapi.service;

import com.bootcamp.demo_sb_restapi.controller.model.User;
import com.bootcamp.demo_sb_restapi.dto.GovUserDTO;

public interface GovUserService {

  GovUserDTO getUser(Long id);  
}
