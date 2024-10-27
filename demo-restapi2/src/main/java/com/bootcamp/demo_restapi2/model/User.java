package com.bootcamp.demo_restapi2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
  private Integer id;
  private String name;
  private String username;
  private String email;
  private String phone;
  private String website;
  private Company company;
  private Address address;
  @Getter
  @ToString
  public static class Address{
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
    @Getter
    @ToString
    public static class Geo{
      private String lat;
      private String lng;
    }

  }
  @Getter
  @ToString
  public static class Company{
    private String name;
    private String catchPhrase;
    private String bs;
  }
}
