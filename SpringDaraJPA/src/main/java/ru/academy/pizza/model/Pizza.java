package ru.academy.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.academy.pizza.config.ConfigPizza;

@AllArgsConstructor
@Getter
public abstract class Pizza implements Dish {
    private String name;
    private Size size;
    private double price;
    private ConfigPizza cfg;

    public enum Size { SMALL, MEDIUM, LARGE }

}
