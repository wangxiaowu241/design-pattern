package com.xt.design.pattern.strategy;

public class Context {

    public Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doOperation(int num1, int num2) {
        int result = strategy.calculate(num1, num2);

        System.out.println("使用" + strategy.algorithm() + "算法，计算的值为：" + result);
        return result;
    }
}
