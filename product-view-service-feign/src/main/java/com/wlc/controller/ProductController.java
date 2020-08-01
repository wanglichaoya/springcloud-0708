package com.wlc.controller;

import com.wlc.pojo.Product;
import com.wlc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-23
 * @description:
 */
@RestController
@RefreshScope
public class ProductController {

    @Autowired
    ProductService productService;

    @Value("${version2}")
    String version;

    @GetMapping("/products")
    public List<Product> products(Model model) {
        List<Product> products = productService.productList();
        model.addAttribute("version", version);
        System.out.println("当前的版本是：" + version);
        return products;
    }
}
