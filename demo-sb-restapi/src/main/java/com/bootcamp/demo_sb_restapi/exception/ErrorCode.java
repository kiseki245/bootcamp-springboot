package com.bootcamp.demo_sb_restapi.exception;

public enum ErrorCode {
  USER_ID_NOT_FOUND(1, "user ID not found");

  private int code;
  private String message;

  private ErrorCode(int code, String message){
    this.code = code;
    this.message = message;
  }
}
