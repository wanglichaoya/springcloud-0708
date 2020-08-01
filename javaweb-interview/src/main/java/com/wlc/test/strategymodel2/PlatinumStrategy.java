package com.wlc.test.strategymodel2;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description: 白金会员计算策略
 */
public class PlatinumStrategy implements Strategy {
    /**
     * 定义白金会员计算的方法
     *
     * @param money
     * @return
     */
    @Override
    public double computer(double money) {
        System.out.println("白金会员优惠50元，再打7折");
        return (money - 50) * 0.7;
    }
}
