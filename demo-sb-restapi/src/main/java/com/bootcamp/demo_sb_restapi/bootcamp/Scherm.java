package com.bootcamp.demo_sb_restapi.bootcamp;

public enum Scherm {
  HTTP("http://"), HTTPS("https://"),;

  private String urlPrefix;

  private Scherm(String urlPrefix){
    this.urlPrefix = urlPrefix;
  }
}
