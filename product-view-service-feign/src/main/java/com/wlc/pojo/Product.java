package com.wlc.pojo;

/**
 * @author 王立朝
 * @date 2020-7-23
 * @description:
 */
public class Product {
    private String name;
    private int price;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
}
