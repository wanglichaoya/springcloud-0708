package com.wlc.service;

import com.wlc.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-22
 * @description:
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProudcts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "server.port--->" + port, 1));
        products.add(new Product(2, "server.port--->" + port, 2));
        products.add(new Product(3, "server.port--->" + port, 3));
        products.add(new Product(4, "server.port--->" + port, 4));
        return products;
    }
}
