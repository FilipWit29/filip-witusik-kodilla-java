package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(),new ProductRepository(),
                new ProductOrderService());
        orderProcessor.process(order);
    }
}
