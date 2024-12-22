package com.bootcamp.demo_restapi2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class GovPostDTO {
  private String title;
  private String body;
}
