package com.bootcamp.demo_restapi2.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo_restapi2.controller.GovAlburmController;
import com.bootcamp.demo_restapi2.dto.GovAlburmDTO;
import com.bootcamp.demo_restapi2.mapper.AlburmMapper;
import com.bootcamp.demo_restapi2.service.AlubrmService;

@RestController
public class GovAlburmControllerImpl implements GovAlburmController{
  @Autowired
  private AlubrmService alubrmService;

  public GovAlburmDTO getAlburmFromDB(Long id){
    GovAlburmDTO alburm = AlburmMapper.mapforgov(alubrmService.getAlburm(id));

    return alburm;
  }
}
