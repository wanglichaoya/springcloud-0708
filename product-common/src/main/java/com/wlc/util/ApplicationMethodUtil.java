package com.wlc.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NumberUtil;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author 王立朝
 * @date 2020-7-29
 * @description: 微服务Application 启动类的一些功能方法
 */
public class ApplicationMethodUtil {

    /**
     * 获取
     */
    public static int getApplicationPort(int defaultPort,String msg) {
        int port;
        Future<Integer> future = ThreadUtil.execAsync(() -> {
            int p;
            System.out.println(msg);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String strPort = scanner.nextLine();
                if (!NumberUtil.isInteger(strPort)) {
                    System.err.println("只能是数字");
                    continue;
                } else {
                    p = Convert.toInt(strPort);
                    scanner.close();
                    break;
                }
            }
            return p;
        });
        try {
            port = future.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            port = defaultPort;
        }
        return port;
    }
}
