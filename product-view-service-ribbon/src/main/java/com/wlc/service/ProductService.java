package com.wlc.service;

import com.wlc.client.ProductClientRibbon;
import com.wlc.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-22
 * @description:
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProduct() {
        List<Product> products = productClientRibbon.listProduct();
        return products;
    }
}
