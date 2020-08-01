package com.wlc.test.factorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:圆形的 类实现类
 */
public class Circle implements Shape {

    /**
     * 画画的接口
     */
    @Override
    public void draw() {
        System.out.println("这个是  Circle  的类");
    }
}
