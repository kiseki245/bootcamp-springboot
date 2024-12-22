package com.bootcamp.demo_restapi2.exception;

public enum ErrorCode {
  USER_ID_NOT_EXIST(1, "User ID not exist"),
  USER_ALREADY_EXIST(2, "user already exist");
  private int code;
  private String message;

  private ErrorCode(int code, String message){
    this.code = code;
    this.message = message;
  }

  public int getCode(){
    return this.code;
  }

  public String getMessage(){
    return this.message;
  }
}
