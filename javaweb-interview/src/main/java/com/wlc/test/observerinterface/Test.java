package com.wlc.test.observerinterface;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setMsg("8");
        System.out.println("更新前的消息为： 2");
        new Obsver1(subject, subject.getMsg());
        new Obsver2(subject, subject.getMsg());
        subject.setMsg("9");
        System.out.println("更新前的消息为： 4");
    }
}
