package com.bootcamp.demo_restapi2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
  private String name;
  private String username;
  private String email;
  private String phone;
  private String website;

}
