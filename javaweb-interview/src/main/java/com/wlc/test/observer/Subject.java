package com.wlc.test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description: 被观察的类
 */
public class Subject {

    /**观察的类的集合*/
    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObversers();
    }

    // 订阅的方法
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObversers() {
        for (Observer s :
                observerList) {
            s.update();
        }
    }
}
