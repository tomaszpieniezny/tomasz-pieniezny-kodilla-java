package Food2Door;

import java.util.Map;

public interface ProcessFood2Door {
    boolean process(Customer customer, Map<Product, Integer> productsOrders);
}
