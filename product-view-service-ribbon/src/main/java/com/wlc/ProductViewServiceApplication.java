package com.wlc;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.NumberUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author 王立朝
 * @date 2020-7-22
 * @description:
 */
@SpringBootApplication
/**@EnableEurekaClient 和 @EnableDiscoveryClient 都是用来发现注册中心的**/
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductViewServiceApplication {
    public static void main(String[] args) {
        int port = 0;
        int defaultPort = 8010;
        Future<Integer> future = ThreadUtil.execAsync(() -> {
            int p = 0;
            System.out.println("请于5秒钟内输入端口号, 推荐  8010  超过5秒将默认使用 " + defaultPort);
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
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductViewServiceApplication.class).properties("server.port=" + port).run(args);

    }

    /***
     * 使用RestTemplate  来进行负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}