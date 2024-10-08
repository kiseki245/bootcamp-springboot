package com.bootcamp.demo_calculator.model;

import java.util.Arrays;

public class Database {
  private static String[] strings = new String[] {"abc", "def", "hij"};

  public static String getString(int index){
    return strings[index];
  }
  public static String[] getValue(){
    return strings;
  }
  
  public static int size(){
    return strings.length;
  }
  public static String addString(String string){
    String[] newArray = Arrays.copyOf(strings, strings.length + 1);
    newArray[newArray.length - 1] = string;
    strings = newArray;
    return newArray[newArray.length-1];
  }


}
