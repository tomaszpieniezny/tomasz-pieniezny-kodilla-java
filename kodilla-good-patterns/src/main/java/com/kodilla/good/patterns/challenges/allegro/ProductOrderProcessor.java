package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService,
                                 ProductOrderService productOrderService,
                                 ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest){
        boolean isSuccessfullySold = productOrderService.sold(productOrderRequest.getProduct(),
                                                                productOrderRequest.getUser(),
                                                                productOrderRequest.getQuantity(),
                                                                productOrderRequest.getOrderDate());
        if (isSuccessfullySold){
            informationService.information(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getProduct(),
                                                        productOrderRequest.getUser(),
                                                        productOrderRequest.getQuantity(),
                                                        productOrderRequest.getOrderDate());
        } else {
            System.out.println("Error! Please try again later.");
        }
        return new ProductOrderDTO(productOrderRequest.getProduct(),
                productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getQuantity(),
                isSuccessfullySold);
        }
}

