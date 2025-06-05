package ru.academy.pizza.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.pizza.kitchen.KitchenService;
import ru.academy.pizza.model.Order;

@Service
public class CustomerService {

    @Autowired
    private KitchenService kitchen;

    public void placeOrder(Order order) {
        if (kitchen.canAcceptOrder()) {
            System.out.println("Принят заказ от " + order.getCustomerName());
            kitchen.prepareOrder(order);
        } else {
            System.out.println("Кухня перегружена, заказ отклонён");
        }
    }
}
