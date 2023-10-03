package com.kodilla.good.patterns.challenges;

public class Order {
    public User user;
    public String product;
    public double price;

    public Order(User user, String product, double price) {
        this.user = user;
        this.product = product;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
}
