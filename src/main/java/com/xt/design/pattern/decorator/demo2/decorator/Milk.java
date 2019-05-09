package com.xt.design.pattern.decorator.demo2.decorator;

import com.xt.design.pattern.decorator.demo2.drink.Drink;
import java.math.BigDecimal;

/**
 * 调料-牛奶
 *
 * @author wangxiaoteng
 * @date 2019/5/9 13:31
 */
public class Milk extends Decorator {

  public Milk(Drink drink) {
    super(drink, "牛奶", BigDecimal.ONE);
  }
}
