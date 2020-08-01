package com.wlc;

import brave.sampler.Sampler;
import ch.qos.logback.core.util.TimeUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.NumberUtil;
import com.fasterxml.jackson.core.io.NumberInput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

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
@EnableEurekaClient
public class ProductDataApplication {
    public static void main(String[] args) {

        int port = 0;
        int defaultPort = 8001;
        Future<Integer> future = ThreadUtil.execAsync(() -> {
            int p = 0;
            System.out.println("请于5秒钟内输入端口号, 推荐  8001 、 8002  或者  8003，超过5秒将默认使用 " + defaultPort);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String nextLine = scanner.nextLine();
                if (!NumberUtil.isInteger(nextLine)) {
                    System.out.println("只能是数字");
                    continue;
                } else {
                    p = Convert.toInt(nextLine);
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
            System.out.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }

        new SpringApplicationBuilder(ProductDataApplication.class).properties("server.port=" + port).run(args);

        //SpringApplication.run(ProductDataApplication.class,args);
    }

    /**
     * 配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
     * @return
     */
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
