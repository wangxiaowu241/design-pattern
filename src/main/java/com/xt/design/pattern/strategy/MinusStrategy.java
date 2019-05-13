package com.xt.design.pattern.strategy;

/**
 * 相减的算法策略
 */
public class MinusStrategy implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public String algorithm() {
        return "minus";
    }
}
