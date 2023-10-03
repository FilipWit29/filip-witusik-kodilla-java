package com.kodilla.good.patterns.food2door;

public class Warehouse {
    public boolean placeOrder(Producer producer, String product, int quantity) {
        return producer.process(new Order(product, quantity));
    }
}
