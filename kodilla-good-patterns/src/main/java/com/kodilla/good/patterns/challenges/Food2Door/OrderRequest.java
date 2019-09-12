package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private ProcessFood2Door processFood2Door;
    private Map<Product, Integer> productOrderRequest;


    public OrderRequest(Customer customer, ProcessFood2Door processFood2Door, Map<Product, Integer> productOrderRequest) {
        this.customer = customer;
        this.processFood2Door = processFood2Door;
        this.productOrderRequest = productOrderRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ProcessFood2Door getFoodProducer() {
        return processFood2Door;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }
}