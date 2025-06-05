package ru.academy.pizza.kitchen;

import ru.academy.pizza.model.Order;

public interface KitchenService {
    boolean canAcceptOrder();

    void prepareOrder(Order order);
}
