package com.wlc.test.observerinterface2;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new Obsver1(subject);
        new Obsver2(subject);
        subject.setMsg("8");
        System.out.println("更新前的消息为： 8");

        subject.setMsg("9");
        System.out.println("更新前的消息为： 9");
    }
}
