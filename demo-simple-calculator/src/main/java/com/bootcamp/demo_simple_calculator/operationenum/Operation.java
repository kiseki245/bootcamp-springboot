package com.bootcamp.demo_simple_calculator.operationenum;

public enum Operation {
  ADD("add"),
  SUBTRACT("sub"),
  MULTIPLE("mul"),
  DIVIDE("div");

  private String operatorValue;

  private Operation(String value){
    this.operatorValue = value;
  }
  public String getOperator(){
    return this.operatorValue;
  }
  public Operation


}
