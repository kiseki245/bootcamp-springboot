package com.bootcamp.demo_sb_restapi.controller.model;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
