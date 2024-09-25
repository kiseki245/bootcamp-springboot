package com.bootcamp.demo_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo_calculator.model.Book;


/**
 * @Controller * @Autowired
 *  Spring will help validate if there is a bean for bookController
 *  If yes, Spring will help create testController bean.
 *  If no, Server start fail, because the above validation fail.
 */
@Controller // bean
@ResponseBody
public class TestController {
  // new TestController(bookController)
  // bookController object is from Spring Context

  // 1. Field Injection
  // @Autowired // Inject bookController object from Spring Context into this obkect ref
  private BookContriller bookContriller; // object reference

  // 2. Constructor Injection
  @Autowired // Unnesscery
  public TestController(BookContriller bookContriller){
    this.bookContriller = bookContriller;
  }

  @GetMapping (value = "/test")
  public Book getBook(){
    return bookContriller.getBook(1, 105.2);
  }

}
