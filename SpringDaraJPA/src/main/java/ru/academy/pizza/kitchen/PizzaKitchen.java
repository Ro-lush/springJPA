package ru.academy.pizza.kitchen;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.academy.pizza.model.Order;

@Service
@Primary
@Setter
@Getter
public class PizzaKitchen implements KitchenService {

    //пример инициализации через  параметр
    @Value("${kitchen.capacity}")
    private int capacity;
    private final long timeout;
    private int currentOrders;

    //TODO добавить исключения на корректные значения
    public PizzaKitchen(@Value("${kitchen.timeout}") long timeout) { // приер инициализации через контсруктор
        this.timeout = timeout;
    }

    @Override
    public boolean canAcceptOrder() {
        return currentOrders < capacity;
    }

    @Override
    public void prepareOrder(Order order) {

    }

  /*  @Override
    public void prepareOrder(Order order) {
        currentOrders++;
        System.out.println("Готовим: " + order.getDishes());
        // Имитация приготовления
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        currentOrders--;
        System.out.println("Заказ готов: " + order.getCustomerName());
    }*/

}
