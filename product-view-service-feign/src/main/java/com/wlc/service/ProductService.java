package com.wlc.service;

import com.wlc.client.ProductClientFeign;
import com.wlc.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王立朝
 * @date 2020-7-23
 * @description:
 */
@Service
public class ProductService {

    @Autowired
    //@Resource
    ProductClientFeign productClientFeign;


    public List<Product> productList(){
        return productClientFeign.products();
    }
}
