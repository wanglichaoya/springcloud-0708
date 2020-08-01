package com.wlc.test.observer;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class ObserverTest1 extends Observer {

    public ObserverTest1(Subject subject) {
        this.subject = subject;
        // 把需要订阅的类添加到被依赖的类中的集合中
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverTest1 的信息为： " + subject.getState());
    }
}
