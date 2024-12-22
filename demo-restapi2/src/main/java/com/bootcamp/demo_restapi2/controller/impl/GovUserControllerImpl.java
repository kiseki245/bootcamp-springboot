package com.bootcamp.demo_restapi2.controller.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_restapi2.controller.GovUserController;
import com.bootcamp.demo_restapi2.dto.GovUserDTO;
import com.bootcamp.demo_restapi2.enity.UserEntity;
import com.bootcamp.demo_restapi2.exception.CustomException;
import com.bootcamp.demo_restapi2.exception.ErrorCode;
import com.bootcamp.demo_restapi2.exception.GeneralResponse;
import com.bootcamp.demo_restapi2.exception.SysCode;
import com.bootcamp.demo_restapi2.mapper.GovUserMapper;
import com.bootcamp.demo_restapi2.service.UserService;

@RestController
public class GovUserControllerImpl implements GovUserController{
  
  @Autowired
  private UserService userService;

  @Override
  public GeneralResponse<GovUserDTO> getUserFromDBByid(Long id){
    Optional<UserEntity> optUserEntity = this.userService.getUserFromDB(id);
    if (optUserEntity.isPresent()){
      UserEntity userEntity = optUserEntity.get();
      GovUserDTO govUserDto = GovUserMapper.map(userEntity);
      // GovUserDTO govUserDto = new GovUserMapper().map(userEntity);

      return GeneralResponse.<GovUserDTO>builder()
      .status(SysCode.OK)
      .data(List.of(govUserDto))
      .build();
      
    }
    throw new CustomException(ErrorCode.USER_ID_NOT_EXIST);
  }

}
