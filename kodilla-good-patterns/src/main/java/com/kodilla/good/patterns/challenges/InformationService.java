package com.kodilla.good.patterns.challenges;

public class InformationService {
        public boolean inform(Order order) {
                System.out.println("User " + order.getUser() + " ordered: " + order.getProduct()
                        + " and that costs: " + order.getPrice());
                return true;
        }
}
