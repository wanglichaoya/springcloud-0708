package com.wlc.test.proxymodel;

/**
 * @author 王立朝
 * @date 2020-7-17
 * @description: 代理对象，实现和Image 一样的功能
 */
public class ProxyRealImage implements Image {

     private RealImage realImage;
     private String fileName;

     public ProxyRealImage(String fileName){
         this.fileName = fileName;
     }
    @Override
    public void display() {
        if(null == realImage){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
