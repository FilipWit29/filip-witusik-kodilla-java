package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Buy","Bread", 2.0);
            case PAINTINGTASK -> new PaintingTask("Paint", "black", "cat");
            case DRIVINGTASK -> new DrivingTask("Transportation of a person", "Warsaw","Porsche GT3RS");
            default -> null;
        };
    }
}
