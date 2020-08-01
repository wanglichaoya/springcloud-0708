package com.wlc.test;

/**
 * @author 王立朝
 * @date 2020-7-16
 * @description: 单例模式-懒汉模式
 */
public class SingleObject {

    private static SingleObject singleObject;

    private static SingleObject singleObject2 = new SingleObject();

    private SingleObject() {
    }

    /**
     * 懒汉模式
     **/
    public static SingleObject getInstance3() {

        return singleObject2;
    }

    /**
     * 恶汉模式的单例模式
     **/
    public static synchronized SingleObject getInstance2() {
        if (null == singleObject) {
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    /**
     * 双重锁校验
     **/
    public static SingleObject getInstance() {
        if (null == singleObject) {
            synchronized (singleObject) {
                if (null == singleObject) {
                    singleObject = new SingleObject();
                }
            }
        }
        return singleObject;
    }
}
