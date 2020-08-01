package com.wlc.test.strategymodel2;

import com.wlc.test.strategymodel2.enumtype.EnumUserType;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        double result = getResult3(1000, 1);
        System.out.println("结果为：" + result);
    }

    public static double getResult3(double money, int type) {
        int flagMoney = 1000;
        double result = money;
        if (money < flagMoney) {
            return money;
        }
        Strategy strategy =null;
        if (money >= flagMoney) {
            if (type == EnumUserType.SILVER_VIP.getCode()) {

                System.out.println("白银会员 优惠50元");
                strategy = new SilverStrategy();
            } else if (type == EnumUserType.GOLD_VIP.getCode()) {

                System.out.println("黄金会员 8折");
                strategy = new GoldStrategy();
            } else if (type == EnumUserType.PLATINUM_VIP.getCode()) {

                System.out.println("白金会员 优惠50元，再打7折");
                strategy = new PlatinumStrategy();
            } else {
                System.out.println("普通会员 不打折");
                strategy = new OrdinaryStrategy();
            }
        }
        return strategy.computer(money);
    }
    public static double getResult2(double money, int type) {
        int flagMoney = 1000;
        double result = money;
        if (money < flagMoney) {
            return money;
        }
        if (money >= flagMoney) {
            if (type == EnumUserType.SILVER_VIP.getCode()) {

                System.out.println("白银会员 优惠50元");
                result = new PlatinumStrategy().computer(money);
            } else if (type == EnumUserType.GOLD_VIP.getCode()) {

                System.out.println("黄金会员 8折");
                result = new GoldStrategy().computer(money);
            } else if (type == EnumUserType.PLATINUM_VIP.getCode()) {

                System.out.println("白金会员 优惠50元，再打7折");
                result = new PlatinumStrategy().computer(money);
            } else {
                System.out.println("普通会员 不打折");
                result = new OrdinaryStrategy().computer(money);
            }
        }
        return result;
    }

    /**
     * 普通方法
     *
     * @param money
     * @param type
     * @return
     */
    private static double getResult1(double money, int type) {
        int flagMoney = 1000;
        double result = money;
        if (money < flagMoney) {
            return money;
        }
        if (money >= flagMoney) {
            if (type == EnumUserType.SILVER_VIP.getCode()) {

                System.out.println("白银会员 优惠50元");
                result = money - 50;
            } else if (type == EnumUserType.GOLD_VIP.getCode()) {

                System.out.println("黄金会员 8折");
                result = money * 0.8;
            } else if (type == EnumUserType.PLATINUM_VIP.getCode()) {

                System.out.println("白金会员 优惠50元，再打7折");
                result = (money - 50) * 0.7;
            } else {
                System.out.println("普通会员 不打折");
                result = money;
            }
        }
        return result;
    }
}
