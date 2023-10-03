package com.kodilla.good.patterns.challenges;

public class OrderRetriever {
    public Order retrieve() {
        User user = new User("Jacob");
        String product = "Funny Videos Complication";
        double price = 6.99;

        return new Order(user, product, price);
    }
}
