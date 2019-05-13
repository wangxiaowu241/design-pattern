package com.xt.design.pattern.template;

/**
 * 模板方式：
 * 抽象类定义了具体执行步骤，且步骤执行顺序不可改变，即执行步骤顺序方法定义为final。
 * 具体每一步骤实现在子类定义。
 */
public class TemplateDesginTest {

    public static void main(String[] args) {

        new BasketBallGame().play();

        new FootballGame().play();
    }
}
