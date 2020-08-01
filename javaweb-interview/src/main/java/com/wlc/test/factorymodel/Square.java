package com.wlc.test.factorymodel;

/**
 * @author 王立朝
 * @date 2020-7-18
 * @description:正方形 类
 */
public class Square implements Shape{
    /**
     * 画画的接口
     */
    @Override
    public void draw() {
        System.out.println("这个是 Square 类");
    }
}
