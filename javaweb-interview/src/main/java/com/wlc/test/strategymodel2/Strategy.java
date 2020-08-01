package com.wlc.test.strategymodel2;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description: 策略模式接口
 */
public interface Strategy {

    /**
     * 定义计算的方法
     *
     * @param money
     * @return
     */
    double computer(double money);
}
