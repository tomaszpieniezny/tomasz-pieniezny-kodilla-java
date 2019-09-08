package com.kodilla.good.patterns.challenges.allegro;

public class AllegroMain {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ProductOrderRequest productOrderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new CarOrderService(), new CarOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
