package com.wlc.test.proxymodel;

/**
 * @author 王立朝
 * @date 2020-7-17
 * @description:
 */
public class TestProxy {

    public static void main(String[] args){
        Image image = new ProxyRealImage("test fileName");
        image.display();
    }
}
