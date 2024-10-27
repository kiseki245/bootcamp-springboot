package com.bootcamp.demo_sb_restapi.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorRespone {
  private int code;
  private String message;
}
