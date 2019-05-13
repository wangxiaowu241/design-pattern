package com.xt.design.pattern.strategy;

/**
 * 相加的策略算法
 */
public class PlusStrategy implements Strategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public String algorithm() {
        return "plus";
    }
}
