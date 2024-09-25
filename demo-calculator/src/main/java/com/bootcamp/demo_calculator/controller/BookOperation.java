package com.bootcamp.demo_calculator.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo_calculator.model.Bag;
import com.bootcamp.demo_calculator.model.Book;

public interface BookOperation {

  @GetMapping(value = "/book/{id}/{price}")
  public Book getBook(@PathVariable int id,@PathVariable double price);
  // http://127.0.0.1:8081/book?A=1&B=13
  @GetMapping(value = "/book")
  public Book getBook2(@RequestParam(value = "A") int id, @RequestParam(value = "B") double price);
  
  @GetMapping(value = "/booklist")
  public List<Book> getBookList();
  

  @GetMapping(value = "/bookmap")
  public HashMap<Integer, Book> getBookMap();

  @GetMapping(value = "/bookarray")
  public Book[] getBookArray();
  
  
  @GetMapping(value = "/bookset")
  public HashSet<Book> getBookSet();

  @GetMapping(value = "/bag")
  public Bag getBag();
}
