package com.wlc.test.observerinterface;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class Obsver1 implements Observer {

    public Obsver1(Subject subject,String msg){
        subject.setMsg(msg);
        subject.attach(this);
    }
    @Override
    public void update(String msg) {
        System.out.println("Obsver1 现在的信息为： " + msg);
    }


}
