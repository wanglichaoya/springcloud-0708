package com.wlc;

import brave.sampler.Sampler;
import cn.hutool.core.util.NetUtil;
import com.wlc.util.ApplicationMethodUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author 王立朝
 * @date 2020-7-23
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
/*@EnableCircuitBreaker共享信息给监控中心*/
@EnableCircuitBreaker
public class ProductViewFeignApplication {

    public static void main(String[] args) {
        int port = 0;
        int defaultPort = 8012;

        // 判断rabbitmq端口是否启动了
        int rabbtMqPort = 5672;
        if(NetUtil.isUsableLocalPort(rabbtMqPort)){
            System.err.printf("rabbitmq服务没有启动，%d 端口不可用，所以退出%n", rabbtMqPort);
            System.exit(1);
        }

        // 获取启动的端口号
        String msg = "请于5秒钟内输入端口号, 推荐  8012 、 8013  或者  8014，超过5秒将默认使用:  " + defaultPort;
        port = ApplicationMethodUtil.getApplicationPort(defaultPort, msg);
        if (!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductViewFeignApplication.class).properties("server.port=" + port).run(args);
    }

    /**
     * 配置 Sampler 抽样策略： ALWAYS_SAMPLE 表示持续抽样
     *
     * @return
     */
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
