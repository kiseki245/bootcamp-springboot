package com.bootcamp.demo_restapi2.infra;

public enum Scheme {
  HTTP("http"),
  HTTPS("https");

  private String potocol;
  Scheme(String potoco1){
    this.potocol = potoco1;
  }
}
