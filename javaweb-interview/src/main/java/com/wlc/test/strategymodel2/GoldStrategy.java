package com.wlc.test.strategymodel2;

import java.util.Stack;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:黄金会员策略
 */
public class GoldStrategy implements Strategy {
    /**
     * 定义黄金会员计算的方法
     *
     * @param money
     * @return
     */
    @Override
    public double computer(double money) {
        System.out.println("黄金会员打八折");
        return money*0.8;
    }
}
