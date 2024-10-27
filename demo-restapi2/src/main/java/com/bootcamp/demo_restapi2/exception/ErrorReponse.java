package com.bootcamp.demo_restapi2.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ErrorReponse {
  private int code;
  private String message;
}
