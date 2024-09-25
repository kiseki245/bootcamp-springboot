package com.bootcamp.demo_calculator.service;

import org.springframework.stereotype.Service;
import com.bootcamp.demo_calculator.model.Database;

@Service // Compoent -> bean
public class DatabaseService {
  public String getString(int index){
    return Database.getString(index);
  }

  public String addString(String newString){
    return Database.addString(newString);
  }

  public String[] getValue(){
    return Database.getValue();
  }
}
