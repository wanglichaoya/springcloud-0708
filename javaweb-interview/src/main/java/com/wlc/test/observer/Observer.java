package com.wlc.test.observer;


/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:观察者抽象类
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
