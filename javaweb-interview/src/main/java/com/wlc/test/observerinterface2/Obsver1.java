package com.wlc.test.observerinterface2;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class Obsver1 extends Observer {

    public Obsver1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("Obsver1 现在的信息为： " + msg);
    }


}
