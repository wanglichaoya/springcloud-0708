package com.wlc.test.strategymodel2;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:普通会员策略
 */
public class OrdinaryStrategy implements Strategy {
    /**
     * 普通会员计算方法
     *
     * @param money
     * @return
     */
    @Override
    public double computer(double money) {
        System.out.println("普通会员不打折");
        return money;
    }
}
