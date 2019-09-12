package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.*;

public class GlutenFreeShop implements ProcessFood2Door {
    private Map<Product, Integer> productsList;
    private List<Customer> blackList;

    public GlutenFreeShop() {
        productsList = createProductList();
        blackList = createBlackList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new GlutenFreeProduct("bread", "Bread made from bio flour"), 50);
        productsList.put(new GlutenFreeProduct("rice", "Bio white rice"), 150);


        return productsList;
    }

    private List<Customer> createBlackList() {
        List<Customer> blackList = new ArrayList<>();
        blackList.add(new Customer("Tomek"));
        return blackList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (!blackList.contains(customer) && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Gluten Free Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}