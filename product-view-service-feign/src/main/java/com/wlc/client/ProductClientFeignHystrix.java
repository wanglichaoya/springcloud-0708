package com.wlc.client;

import com.wlc.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-29
 * @description:
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {
    @Override
    public List<Product> products() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("数据不可用",0,0));

        return products;
    }
}
