package com.wlc.test.observerinterface2;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update(String msg);

}
