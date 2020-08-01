package com.wlc.test.observer;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class ObserverTest2 extends Observer {

    public ObserverTest2(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverTest2 的信息为： " + subject.getState());
    }
}
