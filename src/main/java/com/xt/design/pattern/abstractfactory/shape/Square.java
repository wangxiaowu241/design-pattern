package com.xt.design.pattern.abstractfactory.shape;

/**
 * @author wangxiaoteng
 * @date 2019/4/29 17:25
 */
public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside Square method running...");
  }
}
