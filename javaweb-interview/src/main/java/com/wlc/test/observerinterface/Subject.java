package com.wlc.test.observerinterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description: 被观察者
 */
public class Subject {

    private String msg;

    List<Observer> lists = new ArrayList<>();

    public String getMsg() {
        return msg;
    }

    // 让所有的订阅者都更新
    public void setMsg(String msg) {
        this.msg = msg;
        update();
    }

    public void attach(Observer observer) {
        lists.add(observer);
    }

    public void update() {
        // 把所有的都更新
        for (Observer lists
                : lists
        ) {
            lists.update(this.msg);
        }
    }
}
