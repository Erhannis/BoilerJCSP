/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.boilerjcsp;

import org.jcsp.lang.Any2OneCallChannel;
import org.jcsp.lang.CSProcess;

/**
 *
 * @author erhannis
 */
public class TestProcess implements CSProcess {
  private static class TestProcessCallChannel extends Any2OneCallChannel {
    private static final int METHOD1 = 0;
    private static final int METHOD2 = 1;

    private void method1(int blah) {
      join();
      ((TestProcess) server).rawMethod1(blah);
      selected = METHOD1;
      fork();
    }

    private int method2() {
      join();
      int result = ((TestProcess) server).rawMethod2();
      selected = METHOD2;
      fork();
      return result;
    }
  }
  private TestProcessCallChannel call = new TestProcessCallChannel();

  public static interface CallTestProcessCallChannel {

  }

  public void method1(int blah) {
    call.method1(blah);
  }
  
  public int method2() {
    return call.method2();
  }
  
  private void rawMethod1(int blah) {
    System.out.println("rawMethod1: " + blah);
  }

  private int rawMethod2() {
    return -1;
  }

  @Override
  public void run() {
    while (true) {
      call.accept(this);
    }
  }
}
