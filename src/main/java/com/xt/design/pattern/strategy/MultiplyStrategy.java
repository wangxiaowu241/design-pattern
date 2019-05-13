package com.xt.design.pattern.strategy;

/**
 * 相乘的算法策略
 */
public class MultiplyStrategy implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public String algorithm() {
        return "multiply";
    }
}
