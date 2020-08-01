package com.wlc.test.strategymodel;

import com.wlc.test.strategymodel2.Strategy;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description: 策略类
 */
public class Context {

    private IStrategy iStrategy;

    public Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(){}
    public Context(IStrategy Strategy){
        this.iStrategy = Strategy;
    }

    public IStrategy getiStrategy() {
        return iStrategy;
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public int exe(int num1, int num2){
        return iStrategy.doOperation(num1,num2);
    }
}
