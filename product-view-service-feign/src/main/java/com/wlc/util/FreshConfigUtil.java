package com.wlc.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * @author 王立朝
 * @date 2020-7-29
 * @description:
 */
public class FreshConfigUtil {

    public void freshConfig(){
        HashMap<String,String> headers =new HashMap<>();
        headers.put("Content-Type", "application/json; charset=utf-8");
        System.out.println("因为要去git获取，还要刷新config-server, 会比较卡，所以一般会要好几秒才能完成，请耐心等待");

        String result = HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh").addHeaders(headers).execute().body();
        System.out.println("result:"+result);
        System.out.println("refresh 完成");
    }
    public static void access(int port){
        try {
            String html= HttpUtil.get(String.format("http://127.0.0.1:%d/products",port));
            System.out.printf("%d 地址的视图服务访问成功，返回大小是 %d%n" ,port, html.length());
        }
        catch(Exception e) {
            System.err.printf("%d 地址的视图服务无法访问%n",port);
        }
    }
    public static void main(String[] args){
       while (true){
           ThreadUtil.sleep(1000);
           access(8012);
           access(8013);
       }

    }
}
