package ru.academy.pizza.kitchen;

import org.springframework.stereotype.Service;
import ru.academy.pizza.model.Order;

@Service
//@Primary
public class JapaneseKitchen implements KitchenService {
    @Override
    public boolean canAcceptOrder() {
        return false;
    }

    @Override
    public void prepareOrder(Order order) {

    }


}
