package com.wlc.test.observer;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description:
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new ObserverTest1(subject);
        new ObserverTest2(subject);
        subject.setState(1);
        System.out.println("第一次state的信息为:1");
        subject.setState(2);
        System.out.println("第二次state的信息为：2");
    }
}
