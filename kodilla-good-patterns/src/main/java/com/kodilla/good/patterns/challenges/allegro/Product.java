package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;

abstract public class Product {
    private String nameProduct;
    private String descriptionProduct;
    private BigDecimal priceProduct;

    public Product(String nameProduct, String descriptionProduct, BigDecimal priceProduct) {
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", descriptionProduct='" + descriptionProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
