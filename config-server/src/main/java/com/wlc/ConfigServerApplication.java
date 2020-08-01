package com.wlc;

import com.wlc.util.ApplicationMethodUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 王立朝
 * @date 2020-7-29
 * @description:
 */
@SpringBootApplication
/*@EnableEurekaClient:表示是一个注册中心客户端*/
@EnableDiscoveryClient
@EnableEurekaClient
/*@EnableConfigServer：表示这个SpringBoot是一个配置服务器*/
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        int port = 8030;
        port = ApplicationMethodUtil.getApplicationPort(port, "请在5秒内输入端口号，默认是8030，推荐8030，8031,8032");
        new SpringApplicationBuilder(ConfigServerApplication.class).properties("server.port=" + port).run(args);
    }


}
