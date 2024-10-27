package com.bootcamp.demo_sb_restapi.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.bootcamp.demo_sb_restapi.bootcamp.GeneralResponse;


// 1. Method A -> Method B -> Method C -> return object to B -> return object to A
// 2. Method A -> Method B -. Method C -> thrown Exception -> B handle exception ...

@RestControllerAdvice //bean
public class GlobalExceptionHandler {
  //try to catch someing
  @ExceptionHandler(BusinessException.class)
  public ErrorRespone businessExceptionHandler(BusinessException e){
    return ErrorRespone.builder()
    .code(e.getCode())
    .message(e.getMessage())
    .build();
  }

}
