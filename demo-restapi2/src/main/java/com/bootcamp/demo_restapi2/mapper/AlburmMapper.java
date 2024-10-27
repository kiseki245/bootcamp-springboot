package com.bootcamp.demo_restapi2.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_restapi2.enity.AlburmEnity;
import com.bootcamp.demo_restapi2.model.Alburm;

@Component
public class AlburmMapper {
  public AlburmEnity map(Alburm alburm){ //Save the data to DB, transfer the alburm to Enity item
    return AlburmEnity.builder() // Use Enity builder mape the value from Alburnm
    .userId(alburm.getUserId()) // userId (Connected to DB) < alburm.getUserId() 
    .id(alburm.getId())
    .title(alburm.getTitle())
    .build();
  }

  public Alburm map(AlburmEnity alburmEnity){
    return Alburm.builder()
    .userId(alburmEnity.getUserId())
    .id(alburmEnity.getId())
    .title(alburmEnity.getTitle())
    .build();
  }


}
