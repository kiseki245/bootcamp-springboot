package com.bootcamp.demo_calculator.controller.impl;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo_calculator.controller.BookOperation;
import com.bootcamp.demo_calculator.model.Bag;
import com.bootcamp.demo_calculator.model.Book;
import com.bootcamp.demo_calculator.model.Bag.Color;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
// annocation -> before server start completed, new BookController
// the created object -> Spring Context (not the heap memory, It is separeated memory location)
// All this kind of object, we call it 'Bean'
// This bean MUST be created before server start completed
// Implication: If the bean fail to create, server start fails. 
// If bean not exist, server start fail, no API services
@ResponseBody
public class BookContriller implements BookOperation{

  public Book getBook(int id, double price){
    return new Book(id, price, null);

  }
  // http://127.0.0.1:8081/book?A=1&B=13
  public Book getBook2(int id,  double price) {
      return new Book(id, price, null);
  }
  
  public List<Book> getBookList(){
    System.out.println("getBooks() triggered");
    return List.of(new Book(1, 10.3, null), new Book(2, 15.3, null));
  }
  

  public HashMap<Integer, Book> getBookMap(){
    System.out.println("getBookMap() triggered");
    HashMap<Integer, Book> bookMap = new HashMap<>();
    Book b1 = new Book(3, 40.2, null);
    Book b2 = new Book(4, 50.2, null);
    Book b3 = new Book(5, 60.2, null);
    Book b4 = new Book(5, 70.2, null); //Will not shows

    bookMap.put(1, b1);
    bookMap.put(2, b2);
    bookMap.put(3, b3);

    return bookMap;
  }

  public Book[] getBookArray() {
    Book[] bookarr = new Book[4];
    bookarr[0] = new Book(3, 40.2, null);
    bookarr[1] = new Book(4, 50.2, null);
    bookarr[2] = new Book(5, 60.2, null);
    bookarr[3] = new Book(5, 70.2, null); 

      return bookarr;
  }
  
  
  public HashSet<Book> getBookSet(){
    HashSet<Book> bookSet = new HashSet<>();
    bookSet.add(new Book(7, 46.1, null));
    bookSet.add(new Book(8, 79.1, null));
    bookSet.add(new Book(9, 103.2, null));

    return bookSet;
  }

  public Bag getBag(){
    return Bag.builder()
    .books(List.of(new Book(1, 10.3, null), new Book(22, 12.23, null)))
    .color(Color.BLUE).build();
  }
  

  public static void main(String[] args) {

  }
}
