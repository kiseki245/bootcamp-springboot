package com.bootcamp.demo_sb_restapi.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostRequest {
  private Long userId;
  private Long id;
  private String title;
  private String body;
}
