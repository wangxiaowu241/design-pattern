package com.xt.design.pattern.abstractfactory;

import com.xt.design.pattern.abstractfactory.color.Color;
import com.xt.design.pattern.abstractfactory.shape.Shape;

/**
 * @author wangxiaoteng
 * @date 2019/4/29 17:40
 */
public abstract class AbstractFactory {

  public abstract Shape getShape(String shape);

  public abstract Color getColor(String color);
}
