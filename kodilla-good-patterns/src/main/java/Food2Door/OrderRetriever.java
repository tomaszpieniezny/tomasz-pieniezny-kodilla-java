package Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("Tomek");
        ProcessFood2Door processFood2Door = new GlutenFreeShop();
        Map<Product, Integer> productsList = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from bio flour"), 2);
        productsList.put(new GlutenFreeProduct("rice", "Bio white rice"), 3);


        orderRequestList.add(new OrderRequest(customer, processFood2Door, productsList));

        Customer customer1 = new Customer("Marek");
        ProcessFood2Door processFood2Door1 = new GlutenFreeShop();
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList.put(new GlutenFreeProduct("bread", "Bread made from bio flour"), 2);
        productsList.put(new GlutenFreeProduct("rice", "Bio white rice"), 3);

        orderRequestList.add(new OrderRequest(customer1, processFood2Door1, productsList1));

        return orderRequestList;
    }
}