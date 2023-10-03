package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Producer {
    private String name;

    public GlutenFreeShop() {
        this.name = "Gluten Free Shop";
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Order for " + name + ": " + order.getQuantity() + " " + order.getProductName());

        boolean preparationSuccessful = prepareOrder(order.getProductName(), order.getQuantity());

        if (preparationSuccessful) {
            boolean orderSuccessful = fulfillOrder(order.getProductName(), order.getQuantity());

            if (orderSuccessful) {
                System.out.println("Order for " + name + " completed");
                return true;
            } else {
                System.out.println("Error processing order for " + name);
                return false;
            }
        } else {
            System.out.println("Error processing order for " + name);
            return false;
        }
    }

    private boolean prepareOrder(String productName, int quantity) {
        System.out.println("Preparing order for " + name);
        return true;
    }

    private boolean fulfillOrder(String productName, int quantity) {
        System.out.println("Order fulfillment for " + name);
        return true;
    }
}
