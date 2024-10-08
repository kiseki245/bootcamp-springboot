package com.bootcamp.demo_sb_restapi.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
public class urlmanager {
  private String domain;
  private String endpoint;
  private Scherm scherm;


  @Override
  public String toString(){
    return "https://".concat(this.domain).concat("/").concat(this.endpoint);
  }
}
