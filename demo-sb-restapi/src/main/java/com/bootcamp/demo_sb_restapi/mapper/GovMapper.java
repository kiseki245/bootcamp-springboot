package com.bootcamp.demo_sb_restapi.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_sb_restapi.dto.GovUserDTO;
import com.bootcamp.demo_sb_restapi.enity.UserEnity;

@Component
public class GovMapper {
  public static GovUserDTO map(UserEnity userEnity){
    return GovUserDTO.builder()
    .name(userEnity.getName())
    .email(userEnity.getEmail())
    .build();
  }
}
