package com.wlc.client;

import com.wlc.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-23
 * @description:
 */
@FeignClient(value = "product-data-service",fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    @GetMapping("/products")
    List<Product> products();
}
