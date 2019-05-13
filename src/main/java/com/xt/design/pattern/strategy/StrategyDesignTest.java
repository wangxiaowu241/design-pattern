package com.xt.design.pattern.strategy;

/**
 * 策略模式test
 * context：持有strategy引用
 * strategy:抽象策略类
 * ConcreteStrategy：具体策略算法类
 */
public class StrategyDesignTest {

    public static void main(String[] args) {

        int num1 = 10, num2 = 5;

        PlusStrategy plusStrategy = new PlusStrategy();

        Context context = new Context(plusStrategy);
        context.doOperation(num1, num2);

        MinusStrategy minusStrategy = new MinusStrategy();
        context = new Context(minusStrategy);
        context.doOperation(num1, num2);

        MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
        context = new Context(multiplyStrategy);
        context.doOperation(num1, num2);
    }
}
