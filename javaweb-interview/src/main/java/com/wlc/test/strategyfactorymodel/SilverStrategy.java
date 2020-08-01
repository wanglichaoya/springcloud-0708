package com.wlc.test.strategyfactorymodel;


import com.wlc.test.strategymodel2.enumtype.EnumUserType;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:白银会员策略
 */
public class SilverStrategy implements Strategy {
    /**
     * 定义白银会员计算的方法
     *
     * @param money
     * @return
     */
    @Override
    public double computer(double money) {
        System.out.println("白银会员优惠50元");
        return money - 50;
    }

    /**
     * 返回Type
     *
     * @return
     */
    @Override
    public int getType() {
        return EnumUserType.SILVER_VIP.getCode();
    }
}
