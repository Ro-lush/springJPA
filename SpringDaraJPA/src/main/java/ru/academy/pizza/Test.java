package ru.academy.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.academy.pizza.model.Menu;
import ru.academy.pizza.model.Order;
import ru.academy.pizza.repository.MenuRepository;
import ru.academy.pizza.repository.OrderRepository;
import ru.academy.pizza.service.MenuService;
import ru.academy.pizza.service.OrderService;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
public class Test {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private MenuRepository menuRepository;
    @org.junit.jupiter.api.Test
    public void testOne(){
        List<Order> orderList = new OrderService(orderRepository).getAllOrders();
        for (Order o:orderList) {
            System.out.println(o.getCustomerName()+" "+o.getOrderAmount());
        }
        List<Menu> menuList = new MenuService(menuRepository).getAllMenuItems();

        for (Menu m:menuList) {
            System.out.println(m.getName()+" "+m.getPrice());
        }


    }
}
