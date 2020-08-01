package com.wlc.test.strategymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public class StrategySubtract implements IStrategy {
    /**
     * 测试这个方法
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
