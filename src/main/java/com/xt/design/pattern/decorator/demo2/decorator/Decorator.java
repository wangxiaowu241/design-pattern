package com.xt.design.pattern.decorator.demo2.decorator;

import com.xt.design.pattern.decorator.demo2.drink.Drink;
import java.math.BigDecimal;

/**
 * 装饰类基类
 *
 * @author wangxiaoteng
 * @date 2019/5/9 12:25
 */
public abstract class Decorator extends Drink {

  private Drink drink;

  private BigDecimal cost;

  private String description;

  public Decorator(Drink drink, String description, BigDecimal cost) {
    this.drink = drink;
    this.description = description;
    this.cost = cost;
  }

  @Override
  public BigDecimal cost() {

    return drink.cost().add(cost);
  }

  @Override
  public String getDescription() {

    return drink.getDescription() + "+" + description;
  }
}
