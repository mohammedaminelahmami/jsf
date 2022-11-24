package com.example.learnjsfff;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("obj")
@RequestScoped
public class Product {
    private String name;
    private String price;
    private String qty;

    public Product()
    {
        //
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String addProduct()
    {
        System.out.println("product inserted...");
        System.out.println(name);
        System.out.println(price);
        System.out.println(qty);
        return "success";
    }
}