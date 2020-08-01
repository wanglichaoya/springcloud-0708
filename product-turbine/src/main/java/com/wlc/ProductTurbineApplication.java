package com.wlc;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author 王立朝
 * @date 2020-7-30
 * @description:
 * @EnableTurbine: 断路器聚合监控
 */
@SpringBootApplication
@EnableTurbine
public class ProductTurbineApplication {

    public static void main(String[] args) {
        int port = 8021;
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d 被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductTurbineApplication.class).properties("server.port=" + port).run(args);
    }

}
