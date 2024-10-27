package com.bootcamp.demo_sb_restapi.bootcamp;

import java.util.List;
import com.bootcamp.demo_sb_restapi.controller.model.User;

public class GeneralResponse<T> {
  
  private String code;
  private String message;
  private List<T> data;

  public static <U> Builder<U> builder(){
    return new Builder<>();
  }
  private GeneralResponse(Builder<T> builder){
    this.code = builder.code;
    this.message = builder.message;
    this.data = builder.data;
  }
  public String getCode(){
    return this.code;
  }

  public String getMessage(){
    return this.message;
  }

  public List<T> getData(){
    return this.data;
  }
  @Override
  public String toString(){
    return "GeneralReponist"
    + "Code" + this.code
    + "Message" + this.message
    + "Data" + this.data;
  }
  public static class Builder<T>{
    private String code;
    private String message;
    private List<T> data;

    // set
    public Builder<T> code(String code){
      this.code = code;
      return this;
    }
    public Builder<T> message(String message){
      this.message = message;
      return this;
    }
    public Builder<T> data(List<T> String){
      this.data = data;
      return this;
    }
    public GeneralResponse<T> build(){
      return new GeneralResponse<>(this);
    
    }
  }
  // public static void main(String[] args) {
  //   GeneralResponse<User> response = GeneralResponse.builder()
  //   .code("000000")
  //   .message("Success")
  //   .data(List.of(new User))
  //   .build();
  // }
}
