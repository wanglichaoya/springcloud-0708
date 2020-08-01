package com.wlc.controller;

import com.wlc.pojo.Product;
import com.wlc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-22
 * @description:
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/listProduct")
    public List<Product> listProduct(){
        List<Product> products = productService.listProduct();
        return products;
    }
}
