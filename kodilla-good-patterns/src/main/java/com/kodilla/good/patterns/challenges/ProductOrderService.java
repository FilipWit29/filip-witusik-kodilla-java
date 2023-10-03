package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public boolean orderProduct(Order order) {
        System.out.println("User " + order.getUser() + " ordered: " + order.getProduct()
                + " and that costs: " + order.getPrice());
        return true;
    }
}
