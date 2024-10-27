package com.bootcamp.demo_restapi2.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_restapi2.dto.GovUserDTO;
import com.bootcamp.demo_restapi2.enity.UserEntity;

@Component
public class GovUserMapper {
  public static GovUserDTO map(UserEntity userEntity){
    return GovUserDTO.builder()
    .name(userEntity.getName())
    .email(userEntity.getEmail())
    .build();
  }
}
