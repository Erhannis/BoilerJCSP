/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.boilerjcsp;

/**
 *
 * @author erhannis
 */
public class MethodDescription {
  public String name;
  public String returnType;
  public String[] argTypes;
  public String[] argNames;

  public MethodDescription(String name, String returnType, String[] argTypes, String[] argNames) {
    this.name = name;
    this.returnType = returnType;
    this.argTypes = argTypes;
    this.argNames = argNames;
  }
}
