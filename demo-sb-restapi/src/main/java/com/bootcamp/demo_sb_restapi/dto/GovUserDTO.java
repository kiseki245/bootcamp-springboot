package com.bootcamp.demo_sb_restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class GovUserDTO {
  private String name;
  private String email;
}
