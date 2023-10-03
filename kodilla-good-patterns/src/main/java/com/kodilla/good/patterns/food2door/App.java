package com.kodilla.good.patterns.food2door;

public class App {
    public static void main(String[] args) {Warehouse warehouse = new Warehouse();

    warehouse.placeOrder(new ExtraFoodShop(), "Apples", 10);
    warehouse.placeOrder(new HealthyShop(), "Lettuce", 5);
    warehouse.placeOrder(new GlutenFreeShop(), "Gluten free bread", 2);
    }
}
