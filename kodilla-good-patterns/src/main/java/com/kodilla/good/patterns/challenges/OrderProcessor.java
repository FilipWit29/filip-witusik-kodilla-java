package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
        private final InformationService informationService;
        private final ProductRepository productRepository;
        private final ProductOrderService productOrderService;

    public OrderProcessor(InformationService informationService, ProductRepository productRepository, ProductOrderService productOrderService) {
        this.informationService = informationService;
        this.productRepository = productRepository;
        this.productOrderService = productOrderService;
    }
    public OrderDto process(final Order order) {
        boolean isOrdered = productOrderService.orderProduct(order);

        if(isOrdered) {
            informationService.inform(order);
            productRepository.createOrder(order);
            return new OrderDto(order.getUser(), true);
        } else {
            return new OrderDto(order.getUser(), false);
        }
    }
}
