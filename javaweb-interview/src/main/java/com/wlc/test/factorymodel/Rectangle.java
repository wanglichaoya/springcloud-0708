package com.wlc.test.factorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:矩形 对象
 */
public class Rectangle implements Shape{
    /**
     * 画画的接口
     */
    @Override
    public void draw() {
        System.out.println("这个是 Rectangle  类");
    }
}
