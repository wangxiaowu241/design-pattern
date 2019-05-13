package com.xt.design.pattern.strategy;

public interface Strategy {

    /**
     * 计算
     *
     * @param num1 第一位数字
     * @param num2 第二位数字
     * @return 计算结果
     */
    int calculate(int num1, int num2);

    String algorithm();
}
