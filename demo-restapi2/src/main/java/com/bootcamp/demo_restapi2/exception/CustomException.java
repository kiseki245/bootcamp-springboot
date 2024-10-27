package com.bootcamp.demo_restapi2.exception;

public class CustomException extends RuntimeException{
  private int code;

  public CustomException(ErrorCode errorCode){
    this(errorCode.getCode(), errorCode.getMessage());
  }

  public CustomException(int code, String message){
    super(message);
    this.code = code;
  }

  public int code(){
    return this.code;
  }
}
