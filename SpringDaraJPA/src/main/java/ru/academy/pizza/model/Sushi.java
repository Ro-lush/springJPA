package ru.academy.pizza.model;

public class Sushi implements Dish {
    private String name;
    private int pieces;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 0;
    }
    // constructor, getters
}
