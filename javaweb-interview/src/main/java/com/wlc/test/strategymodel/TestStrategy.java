package com.wlc.test.strategymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:
 */
public class TestStrategy {

    public static void main(String[] args) {
     /* Context context = new Context(new StrategyAdd());
        System.out.printf("结果为：%d", context.exe(1, 2)); }*/
        Context context = new Context();

        context.setiStrategy(new StrategyAdd());
        System.out.printf("相加 结果为：%d %n", context.exe(2, 3));
        context.setiStrategy(new StrategySubtract());
        System.out.printf("相减结果为：%d %n", context.exe(2, 3));
        context.setiStrategy(new StrategyMultiply());
        System.out.printf("相乘结果为：%d%n", context.exe(2, 3));


    }
}
