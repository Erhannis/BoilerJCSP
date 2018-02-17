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
public class ChannelDescription {
  public enum ChannelType {
    CHANNEL_IN, CHANNEL_OUT, CHANNEL_CALL
  }
  
  public ChannelType type;
  public String name;
  public boolean isInt;
  public String argType;
  public String returnType;

  public ChannelDescription(ChannelType type, String name, boolean isInt, String argType, String returnType) {
    this.type = type;
    this.name = name;
    this.isInt = isInt;
    this.argType = argType;
    this.returnType = returnType;
  }
}
