package com.wlc.client;

import com.wlc.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-22
 * @description: Ribbon 客户端， 通过 restTemplate 访问 http://PRODUCT-DATA-SERVICE/products ，
 * 而 product-data-service 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
 * <p>
 * 注意看，这里只是指定了要访问的 微服务名称，但是并没有指定端口号到底是 8001, 还是 8002.
 */
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;


    public List<Product> listProduct() {
        return restTemplate.getForObject("http://product-data-service/products", List.class);
    }
}
