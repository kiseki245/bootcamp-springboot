package com.bootcamp.demo_restapi2.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// 1. -> Method A -> Method B -> Method C -> return object to B -> return object
// to A
// 2. -> Method A -> Method B -> Method C -> throw exception -> B handle
// exception ...
@RestControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(CustomException.class)
  public ErrorReponse customErrorReponse(CustomException e){
    return ErrorReponse.builder()
    .code(0)
    .message(e.getMessage())
    .build();
  }

  // @ExceptionHandler(Exception.class)
  // public GeneralResponse<Object> exceptionHandler(Exception e){
  //   return GeneralResponse.<Object>builder()
  //   .status(SysCode.FAIL)
  //   .build();
  // }
}
