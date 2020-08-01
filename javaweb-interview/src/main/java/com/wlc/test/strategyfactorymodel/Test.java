package com.wlc.test.strategyfactorymodel;

import com.wlc.test.strategymodel2.enumtype.EnumUserType;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public class Test {

    public double getResult(double money, int type) {
        if (money < 1000) {
            return money;

        }
        Strategy strategy = StrategyFactory.getInstance().get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        return strategy.computer(money);
    }

    public static void main(String[] args) {
       Test test = new Test();
        double result = test.getResult(1000, EnumUserType.PLATINUM_VIP.getCode());
        System.out.println(result);
    }
}
