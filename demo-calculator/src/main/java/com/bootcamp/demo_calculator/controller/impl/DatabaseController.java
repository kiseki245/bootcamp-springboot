package com.bootcamp.demo_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bootcamp.demo_calculator.controller.DatabaseOperation;
import com.bootcamp.demo_calculator.model.Database;
import com.bootcamp.demo_calculator.service.DatabaseService;

@Controller
@ResponseBody
public class DatabaseController implements DatabaseOperation{
  
  @Autowired
  private DatabaseService databaseService;
  @Override
  public String getString(int index){
    boolean isIndexValid = true;
    int idx = -1;
    try{
      idx = index;
    } catch (NumberFormatException e){
      isIndexValid = false;
    }
    if (idx < 0 || idx > Database.size() - 1){
      isIndexValid = false;
      
    } 
    return isIndexValid ? databaseService.getString(index) : "Invalid Input, please try again";
    
  }

  @Override
  public String addString(String newString){
    
    return databaseService.addString(newString);
  }

  @Override
  public String[] getValue(){
    return databaseService.getValue();
  }
}
