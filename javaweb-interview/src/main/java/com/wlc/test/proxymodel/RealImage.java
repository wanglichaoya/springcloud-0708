package com.wlc.test.proxymodel;

/**
 * @author 王立朝
 * @date 2020-7-17
 * @description: 真实对象，实现Image接口，（也就是底层的接口）
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display 的名称为： " + fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("load 名称为： " + fileName);
    }
}
